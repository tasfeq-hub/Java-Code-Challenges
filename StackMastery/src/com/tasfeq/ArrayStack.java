package com.tasfeq;

import java.util.EmptyStackException;

public class ArrayStack {

    private Student[] studentStack;
    private int top;

    public ArrayStack(int capacity){

        studentStack = new Student[capacity];
    }

    public void push(Student student){

        if(top==studentStack.length){
            // resize the backing array. create new array with new length and then copy the previous elements into it
            Student[] newArray = new Student[2*studentStack.length];
            System.arraycopy(studentStack,0,newArray,0,studentStack.length);
            studentStack = newArray;
        }

        studentStack[top++] = student;

    }

    public Student pop(){

        if(isEmpty()){
            throw new EmptyStackException();
        }

        // top always points to the next postion of the top element. so we need to decrement it by 1 to get the value
        Student student = studentStack[--top];
        studentStack[top] = null;
        return student;
    }

    public boolean isEmpty(){

        return top == 0;
    }

    public Student peek(){

        if(isEmpty()){
            throw new EmptyStackException();
        }

        return studentStack[top - 1];

    }

    public int size(){

        return top;
    }

    public void printStack(){

        for(int i = top -1; i>=0; i--){

            System.out.println(studentStack[i]);
        }
    }

}
