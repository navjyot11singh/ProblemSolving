package prioritieQueue;

public class Heap {
    int[] array;
    int size;


    Heap(int[] array, int size) {
        this.array = array;
        this.size = size - 1;
    }

    public void printHeap() {

        for (int i = 0; i <= size; i++) {
            if (array[i] == 0) {
                break;
            }
            System.out.println(array[i]);

        }
    }

    public boolean isHeapEmpty() {
        return size == -1;
    }

    public void add(int val) {
        System.out.println("Size"+size);
        size++;
        array[size] = val;
        upHeap(size);
    }


    public void upHeap(int val) {
        int parent = (val - 1) / 2;

        if (array[val] < array[parent]) {
            int temp = array[val];
            array[val] = array[parent];
            array[parent] = temp;
            upHeap(parent);
        }
        return;

    }

    public void downHeap(int index){
        int leftIndex = 2*index+1;
        int rightIndex = 2*index+2;

        if(size<leftIndex){
            return;
        }
        else if(size==leftIndex){
            if(array[leftIndex]<array[index]){
                int temp = array[leftIndex];
                array[leftIndex]=array[rightIndex];
                array[rightIndex]=temp;
                downHeap(leftIndex);
            }
        }else{
            int swapIndex;
            if(array[leftIndex]<array[rightIndex]){
                swapIndex=leftIndex;
            }else{swapIndex=rightIndex;}

            if(array[swapIndex]<array[index]){
                int temp = array[swapIndex];
                array[swapIndex]=array[index];
                array[index]=temp;
                downHeap(swapIndex);
            }
        }


    }


    public int removeMin(){
        int elememt = array[0];
        array[0]=array[size];
        array[size]=0;
        size--;
        downHeap(0);
        return elememt;

    }

    public static void main(String[] args) {
        int[] array = new int[100];
//        array[0] = 4;
//        array[1] = 5;
//        array[2] = 56;
//        array[3] = 99;
//        array[4] = 35;
//        array[5] = 43;
        Heap heap = new Heap(array, 0);
        heap.add(10);
        heap.add(130);
        heap.add(30);
        heap.add(42);
        heap.add(23);
        heap.printHeap();
        heap.removeMin();
        System.out.println("hello");
        heap.printHeap();

    }


}
