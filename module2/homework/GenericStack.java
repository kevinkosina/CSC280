package module2.homework;

import java.util.Iterator;

public class GenericStack<E> implements Iterable<E> {
    private Node top;
    private int height = 0;

    //Constructor
    public GenericStack(E item) {
        Node newNode = new Node(item);
        top = newNode;
        height = 1;
    }

    public Iterator<E> iterator() {
        return new StackIterator();
    }

    private class Node {
        E value;
        Node next;

        Node(E value) {
            this.value = value;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public E peek() {
        return top.value;
    }

    public void push(E item) {
        Node newNode = new Node(item);//creates a new Node object that will
                                      //eventually be placed on top of the stack
        if (isEmpty()) {
            top = newNode; //sets the newly created node as the top of the stack
        } else {
            newNode.next = top; //connects the pointer from the newly created node
                               //to the previous top
            top = newNode;     //sets the newly created node as the top of the stack
        }
        height++;
    }

    public E pop() {
        if (top == null) return null;
        Node temp = top; //sets item equal to the top Node and gives it a variable
                         //so it can exist in memory
        top = top.next; //sets the top node to the node it points to. This will
                        //remove the previous top node upon garbage collection
        temp.next = null;
        height--;
        return temp.value; //returns the value of the recently removed top node
    }

    // HOMEWORK 2
 public boolean contains(GenericStack<E> stack, E item){
//    StackIterator it = (StackIterator) stack.iterator();  // creates a stack iterator which iterates through
//    while(it.hasNext()){                                  // by using .hasNext(), and finds the item using
//        if(it.next() == item) return true;                // .next()
//    }
//    return false;

    Node temp = top; //TODO: finish Professor method

 return false;
 }


    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    private class StackIterator implements Iterator<E> {
        private Node current = top;

        public boolean hasNext() {
            return current != null;
        }

        public E next() {
            E item = current.value;
            current = current.next;
            return item;
        }
    }
}