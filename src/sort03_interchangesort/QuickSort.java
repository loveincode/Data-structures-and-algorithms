package sort03_interchangesort;

public class QuickSort {
    
    
    public static void quickSort(int[] arrays){        
        quick(arrays);  
        for(int i=0;i<arrays.length;i++)  
           System.out.println(arrays[i]);  
    }  

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
        list[low] = tmp;              //中轴记录到尾     
        return low;                   //返回中轴的位置     
    }    
      
    public static void _quickSort(int[] list, int low, int high) {     
        if (low < high) {     
            int middle = getMiddle(list, low, high);  //将list数组进行一分为二     
            _quickSort(list, low, middle - 1);        //对低字表进行递归排序     
            _quickSort(list, middle + 1, high);       //对高字表进行递归排序     
        }     
    }   
      
    public static void quick(int[] a2) {     
        if (a2.length > 0) {    //查看数组是否为空     
            _quickSort(a2, 0, a2.length - 1);     
        }     
    }   
    
    public static void main(String[] args) {
        int[] array = new int[] { 8, 3, 2, 1, 7, 4, 6, 5 };
        printResult(array);
        quickSort(array);
        printResult(array);
    }

    private static void printResult(int[] array) {
        for (int value : array)
            System.out.print(" " + value + " ");
        System.out.println();
    }
}  
