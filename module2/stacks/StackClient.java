package module2.stacks;

public class StackClient {

    public static void main(String[] args) {
//        StackOfStrings stackOfStrings = new StackOfStrings("To");
//
//        stackOfStrings.push("be");
//        stackOfStrings.push("or");
//        stackOfStrings.push("not");
//        stackOfStrings.push("to");
//        stackOfStrings.push("be");
//
//        stackOfStrings.printStack();
//
//        stackOfStrings.pop();
//        stackOfStrings.pop();
//
//        stackOfStrings.printStack();

        GenericStack<Integer> intStack = new GenericStack<>(1);

        intStack.push(2);
        intStack.push(3);
        intStack.push(4);

        intStack.printStack();

        System.out.println("\nContains item:");
        System.out.println(intStack.contains(intStack, 3));
    }
}

