package module2.queue;

public class QueueClient {

    public static void main(String[] args) {
//        QueueOfStrings stringQueue = new QueueOfStrings();
//
//        stringQueue.enqueue("To");
//        stringQueue.enqueue("be");
//        stringQueue.enqueue("or");
//        stringQueue.enqueue("not");
//        stringQueue.enqueue("to");
//        stringQueue.enqueue("be");
//
//        stringQueue.printQueue();
//
//        stringQueue.dequeue();
//        stringQueue.dequeue();
//
//        stringQueue.printQueue();

        GenericQueue<Character> charQueue = new GenericQueue<>('A');

        charQueue.enqueue('B');
        charQueue.enqueue('C');
        charQueue.enqueue('D');

        charQueue.printQueue();

        System.out.println("\nContains item:");
        System.out.println(charQueue.contains(charQueue,'B'));
    }
}
