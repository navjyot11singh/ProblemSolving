package Queues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue customQueue = new CircularQueue(5);

        customQueue.insert(9);
        customQueue.insert(39);
        customQueue.insert(39);
        customQueue.insert(94);
        customQueue.insert(34);

        customQueue.display();

        System.out.println(customQueue.remove());

        customQueue.insert(188);
        customQueue.display();
    }
}
