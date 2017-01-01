package cc.tinker.whoszus.algorithm;

/**
 * Created by Tinker on 2017/1/1.
 */
public class SortUitls {


    /**
     * 冒泡排序
     *
     * @param originData
     */
    public static int[] sort(int[] originData) {
        int[] data = originData;
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        return data;
    }

}
