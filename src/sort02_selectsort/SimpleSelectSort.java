package sort02_selectsort;

public class SimpleSelectSort {
	
	/**
     * ��ѡ������
     * ԭ����i��args.length-1��ÿ�ε�����i��args.length-1����С����󣩵��Ǹ���������i��λ�ã�Ȼ��i++����ѭ��
     * @param array �����������
     */
    public static void simpleSelectSort(int[] array){
        //minLoc���ڼ�¼i+1��args.length-1����������Сֵ���±꣨i���������i��ʾҪ������λ�á�
        for (int i=0,j=0,minLoc=0; i<array.length; i++) {
            minLoc = i;
            for (j=i+1; j < array.length; j++) {//�ҳ�i+1��args.length-1����������Сֵ���±�
                if(array[j] < array[minLoc]){
                    minLoc = j;
                }
            }

            if(minLoc!=i){//���minLoc!=i��˵��minLoc�б仯���ͽ��н���
                int temp = array[i];
                array[i] = array[minLoc];
                array[minLoc] = temp;
            }
        }
    }
    
    public static void main(String[] args) {
		// ��Ҫ�������������
		int[] array = new int[] { 8, 3, 2, 1, 7, 4, 6, 5 };
		// ���ԭ���������
		printResult(array);
		// ��ѡ���������
		simpleSelectSort(array);
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
