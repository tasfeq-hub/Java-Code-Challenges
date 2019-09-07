package com.tasfeq;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*
            ArrayList Implementation
            *** not synchronized. not good for multi threading
        */

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Tasfequr", "Rahman", 10));
        employeeList.add(new Employee("Atik", "Faysal", 12));
        employeeList.add(new Employee("Shamsur", "Rahman", 15));

        // see all the employees
        employeeList.forEach(employee -> System.out.println(employee));

        // print second employee
        System.out.println(employeeList.get(1));

        // check if array list is empty
        System.out.println(employeeList.isEmpty());

        // change an element
        employeeList.set(1, new Employee("Tasfequr", "RAHMAN ..", 12));
        System.out.println(employeeList.get(1));

        // get the array list size (not the actual array size, it will show how many data is there in the array)
        System.out.println(employeeList.size());

        // get the banking array of the list
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee: employeeArray){
            System.out.println(employee);
        }

        // check if array list contains specif value
        // the class should have equals method for using this feature
        System.out.println(employeeList.contains(new Employee("Shamsur", "Rahman", 15)));

        // get the index of an element
        System.out.println(employeeList.indexOf(new Employee("Shamsur","Rahman", 15)));

        // remove element from list
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));


        /*
            Vector Implementations
            ** synchronized. good for multi threading.
            ** same methods as ArrayList like, set, remove, size, add, indexOf, etc.
        */

        List<Employee> employeeList1 = new Vector<>();

        employeeList1.add(new Employee("Rafi", "Rahman", 133));
        employeeList1.add(new Employee("Eshtiak", "Ahmed", 122));
        employeeList1.add(new Employee("Mahmudul", "Hasan", 125));

        // see all the employees
        employeeList1.forEach(employee -> System.out.println(employee));


        /*
            LinkedList Implementations
        */

        Employee abir = new Employee("Tasfequr","Rahman",1);
        Employee biplob = new Employee("Shamsur","Rahman",2);
        Employee rafi = new Employee("Asif","Rahman",3);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(abir);
        list.addToFront(biplob);
        list.addToFront(rafi);

        // print the list
        list.printList();
        System.out.println(list.getSize());


        /*
            LinkedList Implementations with JDK
            ** JDK LinkedList is doubly of nature that means each node has previous,next and LinkedList has head and tail
        */

        LinkedList<Employee> linkedList = new LinkedList<>();

        // add element in the front of the LinkedList
        linkedList.addFirst(abir);
        linkedList.addFirst(biplob);

        // add method puts element in the end of the LinkedList
        // addLast(); method also does the same
        linkedList.add(rafi);

        // print the elements of LinkedList
        Iterator iterator = linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // removes the first element of the LinkedList
        linkedList.remove();

        // removes the last element of the LinkedList
        linkedList.removeLast();


    }
}
