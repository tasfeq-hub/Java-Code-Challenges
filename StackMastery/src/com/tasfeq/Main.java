package com.tasfeq;

public class Main {

    public static void main(String[] args) {

        /*
            ArrayStack implementation
            best when array resizing is not issue. lots of memory available.
        */
        ArrayStack stack = new ArrayStack(10);

        stack.push(new Student("Tasfequr", "Rahman", 12313));
        stack.push(new Student("Mahfuzur", "Rahman", 123));
        stack.push(new Student("Asif", "Rahman", 342));

        // print the stack
        stack.printStack();

        // peek the top element
        System.out.println(stack.peek());

        // pop element
        System.out.println("Popped :"+ stack.pop());


        /*
            JDK implementation of Stack
            Better to use DEQUE
            LinkedList implements DEQUE Interface, so its better to use LinkedList Stack
        */

        LinkedStack linkedStack = new LinkedStack();

        linkedStack.push(new Student("Tasfequr", "Rahman", 12313));
        linkedStack.printStack();

    }
}
