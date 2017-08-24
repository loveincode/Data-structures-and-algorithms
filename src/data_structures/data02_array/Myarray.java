package data_structures.data02_array;

public class Myarray {
    
	//数组
    private long arr[];
    //数组的有效长度
    private int elements;
    //数组的最大长度
    private int max;
    //初始化
    public Myarray(int max){
        this.max = max;
        arr = new long[max];
    }

    /**
     * 插入数据
     * @param value
     */
    public void insert(long value){
        if (elements > max) {
            throw new ArrayIndexOutOfBoundsException();
        }
        arr[elements] = value;
        elements ++ ;
    }

    /**
     * 显示全部数据
     */
    public void display(){
        System.out.print("[");
        for (int i = 0; i < elements; i++) {
            System.out.print(" "+ arr[i]);
        }
        System.out.println(" ]");
    }

    /**
     * 根据值查找索引
     * @param value
     * @return
     */
    public int search(long value){
        int i;
        for (i = 0; i < elements; i++) {
            //表示找到，退出循环
            if (arr[i] == value) {
                break;
            }
        }
        if (i == elements) {
            return -1;
        }else {
            return i;
        }
    }

    /**
     * 根据索引查找数值
     * @param index
     * @return
     */
    public long get(int index){
        if (index > elements || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return arr[index];
    }

    /**
     * 更改index上的值
     * @param index
     * @param value
     */
    public void change(int index, long value){
        if (index > elements || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        arr[index] = value;
    }

    /**
     * 删除index上的数据
     * @param index
     */
    public void delete(int index){
        if (index > elements || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }else {
            for (int i = index; i < elements; i++) {
                arr[i] = arr[i + 1];
            }
            elements --;
        }
    }

    public static void main(String[] args) {
    	Myarray array = new Myarray(30);
        array.insert(22);
        array.insert(12);
        array.insert(34);
        array.insert(44);
        array.insert(86);
        array.insert(57);
        //显示
        array.display();
        System.out.println("======================================");
        //查找
        System.out.println(array.search(12));
        System.out.println("======================================");
        //修改
        array.change(2, 50);
        array.display();
        System.out.println("======================================");
        //删除
        array.delete(3);
        array.display();
    }
}
