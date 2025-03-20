package module2.homework;

import module2.stacks.GenericStack;

public class ReverseStrings {

    public static void main(String[] args){
        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);
        //Expected Output 'olleh';
    }

    //HOMEWORK 2
    private static String reverseString(String myString) {
        GenericStack<Character> charStack = new GenericStack<>(' '); // creates a stack accepting char type
        String reverseString = "";

        for (int i = 0; i < myString.length() ; i++) {             // traverses through the string char by char and adds it to
            charStack.push(myString.toCharArray()[i]);             // a stack
        }

        for (int i = 0; i < myString.length(); i++) {           // traverses through the string again, now putting the character
            reverseString += charStack.pop();                   // from the stack to the new string
        }

        return reverseString;

//        Professor Method
//        GenericStack<Character> stack = new GenericStack<>(myString.charAt(0));
//        StringBuilder reverseString = new StringBuilder();
//        stack.pop();
//
//        for(char c: myString.toCharArray()){
//            stack.push(c);
//        }
//
//
//        while(!stack.isEmpty()){
//            reverseString.append(stack.pop());
//        }
//        return reverseString.toString();
    }
}
