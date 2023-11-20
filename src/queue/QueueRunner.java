package queue;

public class QueueRunner {
    public static void main(String[] args) {
        Queue queue = new Queue();
//        queue.enQueue(3);
//        queue.enQueue(4);
//        queue.enQueue(1);
//        queue.enQueue(2);
        queue.dequeue();
        queue.dequeue();
//        queue.enQueue(5);
        queue.show();
    }
}
