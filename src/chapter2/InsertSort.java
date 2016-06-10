package chapter2;

import org.junit.Test;

/**
 * Created by szj on 2016/6/9.
 */
public class InsertSort {
    //card
    public static int[] sort = {0,9,8,7,6,5,4,3,2,1};

    @Test
    public void insertSort(){
        //pick card form the second
        for(int i = 1; i < sort.length; i++){
            int pickedCard = sort[i];
            //do insert, compare with the before one
            //j is the before one's index
            int j = i-1;
            while(j > -1 && sort[j] > pickedCard){
                sort[j+1] = sort[j];
                j--;
            }
            sort[j+1] = pickedCard;
        }
        for(int x : sort){
            System.out.print(x+ " ");
        }
    }
}
