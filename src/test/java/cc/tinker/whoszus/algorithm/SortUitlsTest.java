package cc.tinker.whoszus.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tinker on 2017/1/1.
 */
public class SortUitlsTest {


    @Test
    public void testSort(){

        int[] unSort = {7,1,2,6,3,2,4,9};

        int[] sorted = SortUitls.sort(unSort);

        for (Integer data:sorted){
            System.out.print(data+" ");
        }

    }


}