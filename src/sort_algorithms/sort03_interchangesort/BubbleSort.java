package sort_algorithms.sort03_interchangesort;

import common.CommonUtils;

public class BubbleSort {

    /**
     *  交换排序 —— 冒泡排序 O(n2) 稳定
     */

    public static void bubbleSort(int[] arrays) {
        int len = arrays.length;
        // 外层循环控制排序趟数
        for (int i = 0; i < len - 1; i++) {
            // 内层循环控制每一趟排序多少次
            for (int j = 0; j < len - 1 - i; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{8, 3, 2, 1, 7, 4, 6, 5};
        bubbleSort(array);
        CommonUtils.printResult(array);
    }
}
