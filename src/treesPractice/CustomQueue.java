package treesPractice;

class QueueNode {
    protected CustomTrees.Node[] data;
    public static final int DEFAULT_SIZE = 10;

    int end = 0;


    public QueueNode() {
        this(DEFAULT_SIZE);
    }

    public QueueNode(int size) {
        this.data = new CustomTrees.Node[size];
    }


    public boolean isFull() {
        return end == data.length; // ptr is at last index
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(CustomTrees.Node item) {
        if (isFull()) {
            return false;
        } else {
            data[end++] = item;
            return true;
        }
    }


    public CustomTrees.Node remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }

        CustomTrees.Node removed = data[0];

        //shifts the element to the left
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    public CustomTrees.Node front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        return data[0];
    }

    public void display(){
        for (int i=0;i<end;i++){
            System.out.print(data[i]+" <-");
        }
        System.out.println("END");
    }
}
