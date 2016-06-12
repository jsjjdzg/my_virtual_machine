package clrs;

import org.junit.Test;

/**
 * Created by szj on 2016/6/12.
 */
public class RapidSort {
    int[] origin =  {0,9,8,7,6,5,11,3,2,1};

    @Test
    public void main(){
        rapidSort(origin,0,9);
        for(int x : origin){
            System.out.print(x + " ");
        }
    }

    public void rapidSort(int[] sort, int p, int r){
        if(r>p){
            int q = partition(sort, p, r);
            rapidSort(sort, p, q - 1);
            rapidSort(sort, q + 1, r);
        }
    }

    private int partition(int[] sort, int p, int r){
        int temp;
        int x = sort[r];
        int i = p - 1;
        //smaller before i, bigger btween i and j
        for(int k = p; k < r; k++){
            if(sort[k] <= x){
                i++;
                temp = sort[k];
                sort[k] = sort[i];
                sort[i] = temp;
            }
        }
        temp = sort[r];
        sort[r] = sort[i+1];
        sort[i+1] = temp;
        return i+1;
    }
}
