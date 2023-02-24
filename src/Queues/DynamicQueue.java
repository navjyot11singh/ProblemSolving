package Queues;

public class DynamicQueue extends CircularQueue{
    DynamicQueue(){
        super();
    }

    DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) {

        if(this.isFull()){
            //double the size
            int temp[] = new int[data.length*2];


            //copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front+i)%data.length];


            }
            front=0;
            end = data.length;
            data  = temp;


            //at this point we know that array is not full
            //insert item normally using super
        }
        return super.insert(item);
    }
}
