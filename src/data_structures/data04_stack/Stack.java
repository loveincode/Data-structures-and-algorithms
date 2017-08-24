package data_structures.data04_stack;

public class Stack {
	
	private int[] array = new int[5];
    private int top = -1;

    public Boolean stackempty(){
        if(top == -1){
            return true;
        }
        else 
            return false;
    }

    public void push(int x){
        if(top<=array.length-1){
            array[++top] = x;
        }
        else{
            System.out.println("overflow");
        }
    }
    public int pop() {
        int number = -1;
        if(stackempty() != true){
            number = array[top];
            top--;
            return number;
        }
        else
        {
            System.out.println("underflow");
            return -1;
        }
    }

}
