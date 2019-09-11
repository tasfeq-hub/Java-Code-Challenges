package com.tasfeq;

public class Main {

    public static void main(String[] args) {

        Employee abir = new Employee("Tasfequr", "Rahman", 10);
        Employee nadeem = new Employee("Asif", "Hasan", 12);
        Employee john = new Employee("Shajid", "John", 13);

        EmployeeHashTable employeeHashTable = new EmployeeHashTable();
        employeeHashTable.put("Rahman", abir);
        employeeHashTable.put("Hasan", nadeem);
        employeeHashTable.put("John", john);

        // print the hashtable
        employeeHashTable.printHashTable();

        // print a hashtable value
        System.out.println("Retrieve key abir : " + employeeHashTable.get("Rahman"));

    }
}
