package clrs;

import org.junit.Test;

/**
 * Created by szj on 2016/6/11.
 */
public class HeapSort {

    int[] origin = {9, 0, 8, 100, 6, 5, 4, 11, 2, 1};

    @Test
    public void buildMaxHeap() {
        for (int i = (origin.length - 1) / 2; i >= 0; i--) {
            maxHeapify(i);
        }
        //only print
        for (int x : origin) {
            System.out.print(x + " ");
        }
    }

    public void maxHeapify(int index) {
        int leftSonIndex = left(index);
        int rightSonIndex = right(index);
        int largestIndex = -1;
        //index not out of heap size
        if (leftSonIndex < origin.length
                && origin[index] < origin[leftSonIndex]) {
            largestIndex = leftSonIndex;
        }
        if (rightSonIndex < origin.length
                && origin[index] < origin[rightSonIndex]) {
            largestIndex = rightSonIndex;
        }
        if(largestIndex == -1){
            return;
        }
        int temp = origin[index];
        origin[index] = origin[largestIndex];
        origin[largestIndex] = temp;
        maxHeapify(largestIndex);
    }

    public int left(int index) {
        return index * 2;
    }

    public int right(int index) {
        return index * 2 + 1;
    }
}
