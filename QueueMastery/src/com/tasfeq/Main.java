package com.tasfeq;

public class Main {

    public static void main(String[] args) {


        User abir  = new User("Tasfequr", "Rahman", 1);
        User rafi  = new User("Asif", "Rahman", 2);
        User biplob = new User ("Shamsur", "Rahman", 2);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(abir);
        queue.add(rafi);

        // print all the queue elements
        queue.printQueue();

        queue.remove();
        queue.add(biplob);

        queue.printQueue();
    }
}
