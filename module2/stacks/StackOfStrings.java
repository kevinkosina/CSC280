package module2.stacks;

public class StackOfStrings {

    private Node top;
    private int height;

    static class Node {

        String value;

        Node next;

        Node(String value){ // Constructor
            this.value = value;
        }
    }

    public StackOfStrings(String value){

        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(String item){
        Node oldTop = top;
        top = new Node(item);

        top.value = item;
        top.next = oldTop;

        height++;
    }

    public String pop(){
        String item = top.value;
        top = top.next;
        return item;
    }

    public void printStack(){

        Node temp = top;
        System.out.println("This is the String Stack: ");

        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

}
