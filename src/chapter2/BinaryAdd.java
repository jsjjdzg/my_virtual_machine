package chapter2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by szj on 2016/6/10.
 */
public class BinaryAdd {
    int[] x1 = {0, 1, 1, 0, 1, 1, 0, 1};
    int[] x2 = {1, 0, 1, 0, 1, 1, 0, 1};
    List<Integer> x3 = new ArrayList<>();

    @Test
    public void add() {
        int index = x1.length - 1;
        while (index > -1) {
            cal(index);
            index--;
        }
        for (int i = x3.size() - 1; i > -1; i--) {
            System.out.print(x3.get(i));
        }
    }

    public void cal(int index) {
        int i = index;
        //try to add one byte
        int temp1 = x1[i];
        int temp2 = x2[i];
        if (temp1 + temp2 > 1) {
            x3.add(temp1 + temp2 - 2);
            if (index == 0) {
                x3.add(1);
                return;
            }
            x1[i - 1]++;
        } else {
            x3.add(temp1 + temp2);
        }
    }
}
