package module4.homework;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }

        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void bubbleSort() {
        Node sortedUntil = null; // marker to the end of the sorted portion

        while (sortedUntil != this.head.next) {
            Node first = head;
            Node second = first.next;

            while (second != sortedUntil) {
                if (first.value > second.value) { // flip values
                    int temp = first.value;
                    first.value = second.value;
                    second.value = temp;
                }
                first = first.next;
                second = first.next;
            }
            sortedUntil = first;
        }
    }


    public void merge(LinkedList otherList) {
        Node otherHead = otherList.getHead();
        Node dummy = new Node(0);
        Node temp = dummy;
        int mergedLength = 0;

        while(head != null && otherHead != null){
            if(head.value < otherHead.value) {
                temp.next = head;
                temp = temp.next;
                head = head.next;
            } else {
                temp.next = otherHead;
                temp = temp.next;
                otherHead = otherHead.next;
            }
            mergedLength++;
        }

        while(this.head != null) {
            temp.next = head;
            tail = temp.next;
            temp = temp.next;
            head = head.next;
            mergedLength++;
        }

        while(otherHead != null) {
            temp.next = otherHead;
            tail = temp.next;
            otherHead = otherHead.next;
            mergedLength++;
        }
        dummy = dummy.next;
        head = dummy;
        length = mergedLength;
    }
}