package sort_algorithms.sort01_insertsort;

import common.CommonUtils;

/**
 * 内部排序算法之直接插入排序 默认按照从小到大进行排序操作
 */
public class DirectInsertSort {

    // 插入排序  —— 直接插入排序

    /**
     * 直接插入排序的方法 稳定 O(n2) O(1)
     *
     * @param array 需要排序的序列
     */
    public static void directInsertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // 需要进行排序的数组
        int[] array = new int[]{8, 3, 2, 1, 7, 4, 6, 5};
        // 输出原数组的内容
        CommonUtils.printResult(array);
        // 直接插入排序操作
        directInsertSort(array);
        // 输出排序后的相关结果
        CommonUtils.printResult(array);
    }

}