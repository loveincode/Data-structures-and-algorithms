package sort01_insertsort;

public class ShellSort {
	/**
     * ϣ������
     * @param arrays ��Ҫ���������
     */
    public static void shellSort(int[] arrays){
        if(arrays == null || arrays.length <= 1){
            return;
        }
        //����
        int incrementNum = arrays.length/2;
        while(incrementNum >=1){
            for(int i=0;i<arrays.length;i++){
                //���в�������
                for(int j=i;j<arrays.length-incrementNum;j=j+incrementNum){
                    if(arrays[j]>arrays	[j+incrementNum]){
                        int temple = arrays[j];
                        arrays[j] = arrays[j+incrementNum];
                        arrays[j+incrementNum] = temple;
                    }
                }
            }
            //�����µ�����
            incrementNum = incrementNum/2;
        }
    }
    
    public static void main(String[] args) {
		// ��Ҫ�������������
		int[] array = new int[] { 8, 3, 2, 1, 7, 4, 6, 5 };
		// ���ԭ���������
		printResult(array);
		// ϣ���������
		shellSort(array);
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
