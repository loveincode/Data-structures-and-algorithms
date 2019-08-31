package sort_algorithms.sort06bucketsort;

import common.CommonUtils;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    /**
     * 桶排序
     * 思想：
     * 首先遍历一遍数组，找出数组中值最大的元素，假设最大的元素为Max；
     * 然后定义Max+1个“桶”，可以用“队列”或“栈”来定义；
     * 之后再遍历一遍数组，将元素值为i的元素放在第i个桶中；最后从第0个桶开始遍历，将桶中的元素依次放入原有数组中，直到遍历到第Max个桶为止。
     * <p>
     * <p>
     * 桶排序目的是以扩大内存空间为代价，从而减少时间复杂度。
     * <p>
     * 对于N个待排数据，M个桶
     * 时间复杂度 O(N+C)，其中C=N*(logN-logM)
     * 空间复杂度 O(N+M)
     *
     * @param arr
     */

    public static void bucketSort(int[] arr) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        //桶数
        int bucketNum = (max - min) / arr.length + 1;
        ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketNum);
        System.out.println("bucketNum:" + bucketNum);
        for (int i = 0; i < bucketNum; i++) {
            bucketArr.add(new ArrayList<Integer>());
        }

        //将每个元素放入桶
        for (int i = 0; i < arr.length; i++) {
            int num = (arr[i] - min) / (arr.length);
            bucketArr.get(num).add(arr[i]);
        }

        //对每个桶进行排序
        for (int i = 0; i < bucketArr.size(); i++) {
            Collections.sort(bucketArr.get(i));
        }

        System.out.println(bucketArr.toString());
    }

    public static void main(String[] args) {
        int[] array = new int[]{8, 3, 2, 1, 7, 4, 6, 5};
        bucketSort(array);
        CommonUtils.printResult(array);
    }
}
