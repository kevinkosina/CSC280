package module2.homework;

import module2.stacks.GenericStack;

public class QueuesUsingStacks {
    private GenericStack<Integer> stack1;
    private GenericStack<Integer> stack2;
    private boolean isFirst;

    public QueuesUsingStacks() {
        stack1 = new GenericStack<Integer>(1);
        stack2 = new GenericStack<Integer>(2);
        isFirst = true; // this variable helps to catch the first case in enqueue
    }

//  HOMEWORK
    public void enqueue(Integer value) {
//        if (isFirst) {                   // first case: removes initialized values from both stacks
//            stack1.pop(); stack2.pop();  //             and pushes a desired value into pseudo-queue
//            stack1.push(value);
//            isFirst = false;
//        } else {
//            while (!stack1.isEmpty()) {     // transfers all values from stack1 to stack2, flipping
//                stack2.push(stack1.pop());  // their order in the process
//            }
//            stack2.push(value);
//
//            while (!stack2.isEmpty()) {     // transfers back all values, along with a newly enqueued
//                stack1.push(stack2.pop());  // value from previous command, stack1 is now in desired
//            }                               // queue order
//        }

//      Professor Method
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(value);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    // HOMEWORK
    public Integer dequeue() {       // checks if queue is empty, if not, it simply removes and returns
        if(isEmpty()) return null;   // first element
        return stack1.pop();
    }

    public int peek() {
        if(isEmpty()) return 0;
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }
}


