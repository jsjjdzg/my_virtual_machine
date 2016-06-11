package clrs;

import org.junit.Test;

/**
 * Created by szj on 2016/6/10.
 */
public class StockCal {
    @Test
    public void main() {
        int[] array = {7, -7, 4, -7, 4, 1, 6, 11, -3, 7, -1, 5, 3, -5};
        int length = array.length;
        int[] record = findMaximunSum(array, 0, length - 1);
        for (int element : record) {
            System.out.print(element + " ");
        }

    }

    private int[] findMaximunSum(int[] array, int low, int high) {
        int[] record = new int[3];
        record[0] = array[low];
        record[1] = low;
        record[2] = low;
        if (high > low) {
            int length = high - low + 1;
            int[] record1 = findMaximunSum(array, low, low + length / 2 - 1);
            int[] record2 = findMaximunSum(array, low + length / 2, high);
            int[] record3 = findCrossingMaximunSum(array, low, low + length / 2, high);
            if (record1[0] >= record2[0] && record1[0] >= record3[0]) {
                return record1;
            } else if (record2[0] >= record1[0] && record2[0] >= record3[0]) {
                return record2;
            } else {
                return record3;
            }
        }
        return record;
    }

    private int[] findCrossingMaximunSum(int[] array, int low, int mid, int high) {
        int[] record = new int[3];
        int leftMax = -Integer.MAX_VALUE + 10000;
        int rightMax = -Integer.MAX_VALUE + 10000;
        int i, j;
        int sum1 = 0, sum2 = 0, left = 0, right = 0;
        for (i = mid; i >= low; i--) {
            sum1 += array[i];
            if (sum1 >= leftMax) {
                leftMax = sum1;
                left = i;
            }
        }
        for (j = mid + 1; j <= high; j++) {
            sum2 += array[j];
            if (sum2 >= rightMax) {
                rightMax = sum2;
                right = j;
            }
        }
        record[0] = leftMax + rightMax;
        record[1] = left;
        record[2] = right;
        return record;
    }
}
