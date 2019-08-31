package sort_algorithms.sort03_interchangesort;

import common.CommonUtils;

public class QuickSort {

    /**
     * 交换排序 —— 快速排序
     */

    // 获取中间值 并排序操作
    public static int getMiddle(int[] list, int low, int high) {
        // 数组的第一个作为中轴
        int tmp = list[low];
        while (low < high) {
            // 比中轴小的记录移到低端
            while (low < high && list[high] >= tmp) {
                high--;
            }
            list[low] = list[high];
            while (low < high && list[low] <= tmp) {
                low++;
            }
            // 比中轴大的记录移到高端
            list[high] = list[low];
        }
        // 记录到数组第一个值
        list[low] = tmp;
        // 返回中轴的位置
        return low;
    }

    public static void quickSort(int[] list, int low, int high) {
        if (low < high) {
            // 将list数组进行一分为二
            int middle = getMiddle(list, low, high);
            // 对低字表进行递归排序
            quickSort(list, low, middle - 1);
            // 对高字表进行递归排序
            quickSort(list, middle + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{49, 38, 65, 97, 76, 13, 27, 49};
        // 查看数组是否为空
        if (array.length > 0) {
            quickSort(array, 0, array.length - 1);
        }
         CommonUtils.printResult(array);
    }

}
