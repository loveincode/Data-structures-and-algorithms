package sort_algorithms.sort03_interchangesort;

public class QuickSort {
    
	// 交换排序  —— 快速排序
    
    public static void quickSort(int[] arrays){        
        if (arrays.length > 0) {    //查看数组是否为空     
            _quickSort(arrays, 0, arrays.length - 1);     
        } 
    }  

    //获取中间值 并排序操作
    public static int getMiddle(int[] list, int low, int high) {     
        int tmp = list[low];    //数组的第一个作为中轴     
        while (low < high) {     
            while (low < high && list[high] >= tmp) {     
                high--;     
                }     
            list[low] = list[high];   //比中轴小的记录移到低端     
            while (low < high && list[low] <= tmp) {     
                low++;     
            }     
            list[high] = list[low];   //比中轴大的记录移到高端     
        }     
        list[low] = tmp;              //记录到数组第一个值
        printResult(list);
        return low;                   //返回中轴的位置     
    }    
      
    public static void _quickSort(int[] list, int low, int high) {  
    	
        if (low < high) {     
            int middle = getMiddle(list, low, high);  //将list数组进行一分为二     
            _quickSort(list, low, middle - 1);        //对低字表进行递归排序     
            _quickSort(list, middle + 1, high);       //对高字表进行递归排序     
        }     
    }   
      
    
    public static void main(String[] args) {
        int[] array = new int[] { 49, 38, 65, 97, 76, 13, 27, 49};
        quickSort(array);
        printResult(array);
    }

    private static void printResult(int[] array) {
        for (int value : array)
            System.out.print(" " + value + " ");
        System.out.println();
    }
}  
