package clrs;

import org.junit.Test;

/**
 * Created by szj on 2016/6/13.
 */
public class RadixSort {
    int[] origin = {101,201,423,453,123,356,765,56,788};
    int d = 3;
    private int[] b = new int[11]; // output
    private int[] c = new int[20]; // count how many numbers smaller than it

    @Test
    public void main(){

    }

    public void radixSort(){


    }

    public void countSortOne(int[] sort){
        // how many
        for(int i = 0; i < sort.length; i++){
            c[sort[i] % 10] += 1;
        }
        // how many low or equal
        for(int i = 1; i < c.length; i++){
            c[i] = c[i] + c[i-1];
        }
        for(int i = 0; i < sort.length; i++){
            b[c[sort[i] % 10]] = sort[i];
            c[sort[i]] -= 1;
        }
    }
//    public void countSortTen(int[] sort){
//        // how many
//        for(int i = 0; i < sort.length; i++){
//            c[sort[i]] += 1;
//        }
//        // how many low or equal
//        for(int i = 1; i < c.length; i++){
//            c[i] = c[i] + c[i-1];
//        }
//        for(int i = 0; i < a.length; i++){
//            b[c[a[i]]] = a[i];
//            c[a[i]] -= 1;
//        }
//    }
//    public void countSortHundred(int[] sort){
//        // how many
//        for(int i = 0; i < sort.length; i++){
//            c[sort[i]] += 1;
//        }
//        // how many low or equal
//        for(int i = 1; i < c.length; i++){
//            c[i] = c[i] + c[i-1];
//        }
//        for(int i = 0; i < a.length; i++){
//            b[c[a[i]]] = a[i];
//            c[a[i]] -= 1;
//        }
//    }
}
