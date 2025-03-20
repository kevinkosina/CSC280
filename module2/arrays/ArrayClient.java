package module2.arrays;

public class ArrayClient {

    public static void main(String[] args) {

        ArrayStack arrayStack = new ArrayStack();

        arrayStack.push("to");
        arrayStack.push("be");
        arrayStack.push("or");
        arrayStack.push("not");

        arrayStack.printStack(arrayStack);

        arrayStack.pop();

        arrayStack.printStack(arrayStack);

        /*
        ArrayQueue arrayQueue = new ArrayQueue();

        arrayQueue.enqueue("to");
        arrayQueue.enqueue("be");
        arrayQueue.enqueue("or");
        arrayQueue.enqueue("not");

        arrayQueue.printQueue(arrayQueue);

        arrayQueue.dequeue();

        arrayQueue.printQueue(arrayQueue);

         */
    }
}
