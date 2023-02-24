package stack;

public class CustomStack {
    protected int[] data;
    public static final int DEFAULT_SIZE=10;

    int ptr = -1;


    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return  true;
    }

    public int pop() throws  Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from empty stack");
        }
//        int removedItem  = data[ptr];
//        ptr--;
//        return  removedItem;
        return  data[ptr--];
    }

    public  int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from empty stack");
        }
        return data[ptr];

    }


    public boolean isFull(){
        return ptr == data.length - 1; // ptr is at last index
    }

    public boolean isEmpty(){
        return ptr==-1;
    }
}
