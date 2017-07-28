package sort01_insertsort;

/**
 * �ڲ������㷨ֱ֮�Ӳ������� Ĭ�ϰ��մ�С��������������
 */
public class DirectInsertSort {

	/**
	 * ֱ�Ӳ�������ķ���
	 * @param array ��Ҫ���������
	 */
	public static void directInsertSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
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
		// ��Ҫ�������������
		int[] array = new int[] { 8, 3, 2, 1, 7, 4, 6, 5 };
		// ���ԭ���������
		printResult(array);
		// ֱ�Ӳ����������
		directInsertSort(array);
		// �����������ؽ��
		printResult(array);
	}

	/**
	 * 
	 * �����Ӧ����Ľ��
	 * 
	 * @param array
	 */
	private static void printResult(int[] array) {
		for (int value : array)
			System.out.print(" " + value + " ");
		System.out.println();
	}

}