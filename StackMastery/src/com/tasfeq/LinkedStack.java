package com.tasfeq;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {

    private LinkedList<Student> stack;

    public LinkedStack(){

        stack= new LinkedList<Student>();
    }

    public void push(Student student){

        stack.push(student);
    }

    public Student pop(){

        return stack.pop();
    }

    public Student peek(){

        return stack.peek();
    }

    public boolean isEmpty(){

        return stack.isEmpty();
    }

    public void printStack(){

        ListIterator<Student> iterator = stack.listIterator();

        while(iterator.hasNext()){

            System.out.println(iterator.next());
        }
    }
}
