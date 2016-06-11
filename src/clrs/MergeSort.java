package clrs;

import org.junit.Test;

/**
 * Created by szj on 2016/6/10.
 */
public class MergeSort {
    int[] origin = {9, 0, 8, 100, 6, 5, 4, 11, 2, 1, Integer.MAX_VALUE};

    @Test
    public void main() {

        for (int x : mergeSort(origin)) {
            System.out.print(x + " ");
        }
    }

    public int[] mergeSort(int[] sort) {
        int[] merged = sort;
        if (sort.length != 2) {
            int[][] sortList = resolve(sort);
            sortList[0] = mergeSort(sortList[0]);
            sortList[1] = mergeSort(sortList[1]);
            merged = merge(sortList[0], sortList[1]);
        }
        return merged;
    }

    //resolve array to two array
    int[][] resolve(int[] sort) {
        int length = sort.length - 1;
        int length1 = 0;
        int length2 = 0;
        if (length % 2 != 0) {//奇数
            length1 = length / 2 + 1;// + 1 add mark at the end
            length2 = length / 2 + 1 + 1;// + 1 add mark at the end
        } else {
            length1 = length2 = length / 2 + 1;
        }
        int[] sort1 = new int[length1];
        int[] sort2 = new int[length2];
        int k = 0;
        for (int i = 0; i < sort1.length - 1; i++) {
            sort1[i] = sort[k];
            k++;
        }
        for (int i = 0; i < sort2.length - 1; i++) {
            sort2[i] = sort[k];
            k++;
        }
        sort1[length1 - 1] = sort2[length2 - 1] = Integer.MAX_VALUE;//add mark at the end
        int[][] rList = new int[2][length2];
        rList[0] = sort1;
        rList[1] = sort2;
        return rList;
    }

    int[] merge(int[] sort1, int[] sort2) {
        int[] rList = new int[sort1.length + sort2.length - 1];
        rList[rList.length - 1] = Integer.MAX_VALUE;
        int i = 0;//current index of sort1
        int j = 0;//current index of sort2
        int k = 0;//current index of rList
        while (i < sort1.length - 1 && j < sort2.length - 1) {
            if (sort1[i] < sort2[j]) {
                rList[k] = sort1[i];
                k++;
                i++;
            } else {
                rList[k] = sort2[j];
                k++;
                j++;
            }
        }
        if (i == sort1.length - 1) {
            for (; j < sort2.length - 1; j++) {
                rList[k] = sort2[j];
            }
        }
        if (j == sort2.length - 1) {
            for (; i < sort1.length - 1; i++) {
                rList[k] = sort1[i];
            }
        }
        return rList;
    }
}
