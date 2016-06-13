package clrs;

import org.junit.Test;

/**
 * Created by szj on 2016/6/13.
 */
public class RadixSort {
    private int[] origin = {201, 113, 423, 461, 123, 356, 165, 56, 781};
    private int[] c = new int[9]; // count how many numbers smaller than it
    @Test
    public void main() {
        radixSort();
    }

    public void radixSort() {
        for(int x : countSortHundred(countSortTen(countSortOne(origin)))){
            System.out.print(x + " ");
        }
    }

    public int[] countSortOne(int[] sort) {
        int[] b = new int[9]; // output
        // how many
        for (int i = 0; i < sort.length; i++) {
            c[sort[i] % 10] += 1;
        }
        // how many low or equal
        for (int i = 1; i < c.length; i++) {
            c[i] = c[i] + c[i - 1];
        }
        for(int i = sort.length - 1; i > -1; i--){
            b[c[sort[i] % 10] - 1] = sort[i];
            c[sort[i] % 10] -= 1;
        }
        return b;
    }
    public int[] countSortTen(int[] sort){
        int[] b = new int[9]; // output
        c = new int[9];
        // count decade
        for(int i = 0; i < sort.length; i++){
            c[(sort[i]%100)/10] += 1;
        }
        // how many low or equal
        for(int i = 1; i < c.length; i++){
            c[i] = c[i] + c[i-1];
        }
        for(int i = sort.length - 1; i > -1; i--){
            b[c[(sort[i]%100)/10] - 1] = sort[i];
            c[(sort[i]%100)/10] -= 1;
        }
        return b;
    }
    public int[] countSortHundred(int[] sort){
        int[] b = new int[9]; // output
        c = new int[9];
        // how many
        for(int i = 0; i < sort.length; i++){
            c[sort[i]/100] += 1;
        }
        // how many low or equal
        for(int i = 1; i < c.length; i++){
            c[i] = c[i] + c[i-1];
        }
        for(int i = sort.length - 1; i > -1; i--){
            b[c[sort[i]/100] - 1] = sort[i];
            c[sort[i]/100] -= 1;
        }
        return b;
    }
}
