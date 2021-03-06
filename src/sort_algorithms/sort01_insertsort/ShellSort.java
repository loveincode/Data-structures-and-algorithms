package sort_algorithms.sort01_insertsort;

import common.CommonUtils;

public class ShellSort {

    // 插入排序  —— 希尔排序

    /**
     * 希尔排序 不稳定 O(n^2) O(1)
     *
     * @param arrays 需要排序的序列
     */
    public static void shellSort(int[] arrays) {
        if (arrays == null || arrays.length <= 1) {
            return;
        }
        //增量
        int incrementNum = arrays.length / 2;
        while (incrementNum >= 1) {
            for (int i = 0; i < arrays.length; i++) {
                //进行插入排序
                for (int j = i; j < arrays.length - incrementNum; j = j + incrementNum) {
                    if (arrays[j] > arrays[j + incrementNum]) {
                        int temple = arrays[j];
                        arrays[j] = arrays[j + incrementNum];
                        arrays[j + incrementNum] = temple;
                    }
                }
            }
            //设置新的增量
            incrementNum = incrementNum / 2;
        }
    }

    public static void main(String[] args) {
        // 需要进行排序的数组
        int[] array = new int[]{8, 3, 2, 1, 7, 4, 6, 5};
        // 输出原数组的内容
        CommonUtils.printResult(array);
        // 希尔排序操作
        shellSort(array);
        // 输出排序后的相关结果
        CommonUtils.printResult(array);
    }

}