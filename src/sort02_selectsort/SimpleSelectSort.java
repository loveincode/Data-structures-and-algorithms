package sort02_selectsort;

public class SimpleSelectSort {
	
	/**
     * 简单选择排序
     * 原理：从i到args.length-1，每次迭代将i到args.length-1中最小（最大）的那个数交换到i的位置，然后i++，再循环
     * @param array 待排序的数组
     */
    public static void simpleSelectSort(int[] array){
        //minLoc用于记录i+1到args.length-1这个区间的最小值的下标（i会递增），i表示要交换的位置。
        for (int i=0,j=0,minLoc=0; i<array.length; i++) {
            minLoc = i;
            for (j=i+1; j < array.length; j++) {//找出i+1到args.length-1这个区间的最小值的下标
                if(array[j] < array[minLoc]){
                    minLoc = j;
                }
            }

            if(minLoc!=i){//如果minLoc!=i，说明minLoc有变化，就进行交换
                int temp = array[i];
                array[i] = array[minLoc];
                array[minLoc] = temp;
            }
        }
    }
    
    public static void main(String[] args) {
		// 需要进行排序的数组
		int[] array = new int[] { 8, 3, 2, 1, 7, 4, 6, 5 };
		// 输出原数组的内容
		printResult(array);
		// 简单选择排序操作
		simpleSelectSort(array);
		// 输出排序后的相关结果
		printResult(array);
	}

	/**
	 * 
	 * 输出相应数组的结果
	 * 
	 * @param array
	 */
	private static void printResult(int[] array) {
		for (int value : array)
			System.out.print(" " + value + " ");
		System.out.println();
	}

}