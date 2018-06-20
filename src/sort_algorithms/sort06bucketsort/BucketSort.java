package sort_algorithms.sort06bucketsort;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
	
	// 桶排序
	
    public static void bucketSort(int[] arr){
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        
        //桶数
        int bucketNum = (max - min) / arr.length + 1;
        ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketNum);
        System.out.println("bucketNum:"+bucketNum);
        for(int i = 0; i < bucketNum; i++){
            bucketArr.add(new ArrayList<Integer>());
        }
        
        //将每个元素放入桶
        for(int i = 0; i < arr.length; i++){
            int num = (arr[i] - min) / (arr.length);
            bucketArr.get(num).add(arr[i]);
        }
        
        //对每个桶进行排序
        for(int i = 0; i < bucketArr.size(); i++){
            Collections.sort(bucketArr.get(i));
        }
        
        System.out.println(bucketArr.toString());
    }
    
    public static void main(String[] args) {
        int[] array = new int[] { 8, 3, 2, 1, 7, 4, 6, 5 };
        bucketSort(array);
    }
}
