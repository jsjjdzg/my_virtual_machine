package clrs;

import org.junit.Test;

/**
 * Created by szj on 2016/6/13.
 */
public class RadixSort {
    int[] origin = {101, 201, 423, 453, 123, 356, 765, 56, 788};
    int d = 3;
    private int[] b = new int[11]; // output
    private int[] c = new int[1000]; // count how many numbers smaller than it

    @Test
    public void main() {
        radixSort();
    }

    public void radixSort() {
        countSortOne(origin);
        countSortTen(origin);
        countSortHundred(origin);
        for(int i = 0; i < origin.length; i++){

            System.out.print(origin[i] + " ");
        }
    }

    public void countSortOne(int[] sort) {
        // how many
        for (int i = 0; i < sort.length; i++) {
            c[sort[i] % 10] += 1;
        }
        // how many low or equal
        for (int i = 1; i < c.length; i++) {
            c[i] = c[i] + c[i - 1];
        }
        for (int i = 0; i < sort.length; i++) {
            b[c[sort[i] % 10]] = sort[i];
            c[sort[i]] -= 1;
        }
    }
    public void countSortTen(int[] sort){
        // how many
        for(int i = 0; i < sort.length; i++){
            c[sort[i] % 100 - sort[i] % 10] += 1;
        }
        // how many low or equal
        for(int i = 1; i < c.length; i++){
            c[i] = c[i] + c[i-1];
        }
        for(int i = 0; i < sort.length; i++){
            b[c[sort[i] % 100 - sort[i] % 10]] = sort[i];
            c[sort[i] % 100 - sort[i] % 10] -= 1;
        }
    }
    public void countSortHundred(int[] sort){
        // how many
        for(int i = 0; i < sort.length; i++){
            c[sort[i] - sort[i] % 100] += 1;
        }
        // how many low or equal
        for(int i = 1; i < c.length; i++){
            c[i] = c[i] + c[i-1];
        }
        for(int i = 0; i < sort.length; i++){
            b[c[sort[i] - sort[i] % 100]] = sort[i];
            c[sort[i] - sort[i] % 100] -= 1;
        }
    }
}
