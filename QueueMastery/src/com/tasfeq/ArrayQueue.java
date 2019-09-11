package com.tasfeq;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private User[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity){

        queue = new User[capacity];
    }

    public void add(User user){

        if(back == queue.length){

            User[] newArray = new User[2*queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = user;
        back++;
    }

    public User remove(){

        if(size() == 0){

            throw new NoSuchElementException();
        }

        User user = queue[front];
        queue[front] = null;
        front ++;

        if (size()==0){
            front = 0;
            back = 0;
        }

        return user;
    }

    public User peek(){

        if(size() == 0){

            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public void printQueue(){

        for(int i = front; i<back; i++){

            System.out.println(queue[i]);
        }
    }

    public int size(){

        return (back - front);
    }
}
