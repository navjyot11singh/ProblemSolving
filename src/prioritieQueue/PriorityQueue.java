package prioritieQueue;

public class PriorityQueue {
    int size;
    int count;
    static int default_size=10;
    int[] arr;


    PriorityQueue(int size){
        this.size=size;
        arr= new int[size];

    }


    PriorityQueue(){
        this(default_size);
    }


    public void insert(int val){

        int i;
        if(count==0){
            arr[0]=val;
            count++;
            return;
        }

        for (i=count-1;i>=0;i--){
            if(val>arr[i]){
                arr[i+1]=arr[i];
            }else{
                break;
            }
        }

        arr[i+1]=val;
        count++;
    }


    public void display(){
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+"->");
        }
        System.out.println("END");
    }


   public int remove(){
        int elememt = arr[count-1];
        count--;
        return elememt;
   }

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.insert(5);
        priorityQueue.insert(53);
        priorityQueue.insert(2);
        priorityQueue.insert(88);
        priorityQueue.insert(95);
        priorityQueue.display();

        System.out.println(priorityQueue.remove());
        priorityQueue.display();
    }
}
