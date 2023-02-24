package stack;

public class DynamicStack extends  CustomStack{
    public  DynamicStack(){
        super();//this will call CustomStack() constructor
    }

    public  DynamicStack(int size){
        super();//this will call CustomStack(int sizw) constructor
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            //double the size
            int temp[] = new int[data.length*2];


            //copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];

                
            }
            data  = temp;


            //at this point we know that array is not full
            //insert item normally using super
        }
        return  super.push(item);
    }
}
