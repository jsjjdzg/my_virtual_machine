package clrs;

import org.junit.Test;

/**
 * Created by szj on 2016/6/12.
 */
public class CountSort {
    private int[] a = {9, 0, 8, 12, 6, 5, 4, 11, 2, 1}; // input

    private int[] b = new int[11]; // output

    private int[] c = new int[20]; // count how many numbers smaller than it

    @Test
    public void main(){
        countSort(a);
        for(int x : b){
            System.out.print(x + " ");
        }
    }

    private void countSort(int[] sort){
        // how many
        for(int i = 0; i < sort.length; i++){
            c[sort[i]] += 1;
        }
        // how many low or equal
        for(int i = 1; i < c.length; i++){
            c[i] = c[i] + c[i-1];
        }
        for(int i = 0; i < a.length; i++){
            b[c[a[i]]] = a[i];
            c[a[i]] -= 1;
        }
    }
}
