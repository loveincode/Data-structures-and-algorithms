package sort_algorithms.sort01_insertsort;

public class BinarySort {

	/**
	 * 二分法插入排序是在插入第i个元素时，对前面的0～i-1元素进行折半，先跟他们中间的那个元素比， 如果小，则对前半再进行折半，否则对后半进行折半，
	 * 直到left>right，然后再把第i个元素前1位与目标位置之间的所有元素后移，再把第i个元素放在目标位置上。
	 * 
	 * 二分排序的时间复杂度是O(n^2)，空间复杂度O(1)，是稳定排序。
	 * 
	 */
	public static void binarySort(int[] array) {
		int i, j;
		int low, high, mid;
		int temp;
		for (i = 1; i < array.length; i++) {
			temp = array[i];
			low = 0;
			high = i - 1;
			while (low <= high) {
				mid = (low + high) / 2;
				if (array[mid] > temp)
					high = mid - 1;
				else
					low = mid + 1;

			}
			for (j = i - 1; j > high; j--) {
				array[j + 1] = array[j];
			}
			array[high + 1] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] a = { 4, 2, 1, 6, 3, 6, 0, -5, 1, 1 };
		
		binarySort(a);
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d", a[i]);
		}
	}
}
