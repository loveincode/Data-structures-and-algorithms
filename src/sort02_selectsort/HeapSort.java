package sort02_selectsort;

import java.util.Arrays;

public class HeapSort {
	public static void main(String[] args) {
        int[] a={ 8, 3, 2, 1, 7, 4, 6, 5 };
        int arrayLength=a.length;  
        //ѭ������  
        for(int i=0;i<arrayLength-1;i++){  
            //����  
            buildMaxHeap(a,arrayLength-1-i);  
            //�����Ѷ������һ��Ԫ��  
            swap(a,0,arrayLength-1-i);  
            System.out.println(Arrays.toString(a));  
        }  
    }
	
	//��data�����0��lastIndex���󶥶�
    public static void buildMaxHeap(int[] data, int lastIndex){
         //��lastIndex���ڵ㣨���һ���ڵ㣩�ĸ��ڵ㿪ʼ 
        for(int i=(lastIndex-1)/2;i>=0;i--){
            //k���������жϵĽڵ� 
            int k=i;
            //�����ǰk�ڵ���ӽڵ����  
            while(k*2+1<=lastIndex){
                //k�ڵ�����ӽڵ������ 
                int biggerIndex=2*k+1;
                //���biggerIndexС��lastIndex����biggerIndex+1�����k�ڵ�����ӽڵ����
                if(biggerIndex<lastIndex){  
                    //�������ӽڵ��ֵ�ϴ�  
                    if(data[biggerIndex]<data[biggerIndex+1]){  
                        //biggerIndex���Ǽ�¼�ϴ��ӽڵ������  
                        biggerIndex++;  
                    }  
                }  
                //���k�ڵ��ֵС����ϴ���ӽڵ��ֵ  
                if(data[k]<data[biggerIndex]){  
                    //��������  
                    swap(data,k,biggerIndex);  
                    //��biggerIndex����k����ʼwhileѭ������һ��ѭ�������±�֤k�ڵ��ֵ�����������ӽڵ��ֵ  
                    k=biggerIndex;  
                }else{  
                    break;  
                }  
            }
        }
    }
    //����
    private static void swap(int[] data, int i, int j) {  
        int tmp=data[i];  
        data[i]=data[j];  
        data[j]=tmp;  
    } 
}
