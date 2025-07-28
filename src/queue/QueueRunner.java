package queue;

public class QueueRunner {

    public static void main(String[] args) {
        Queue queue = new Queue(2);

        queue.printQueue();
        queue.getFirst();
        queue.getLast();
        queue.getLength();

        queue.enQueue(3);
        queue.enQueue(4);

        queue.printQueue();

        System.out.println(" call DeQueue");
        System.out.println(queue.deQueue().value);

        System.out.println(" after dequeue");
        queue.printQueue();
    }
}
