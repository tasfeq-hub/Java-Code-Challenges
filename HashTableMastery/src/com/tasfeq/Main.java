package com.tasfeq;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Employee abir = new Employee("Tasfequr", "Rahman", 10);
        Employee nadeem = new Employee("Asif", "Hasan", 12);
        Employee john = new Employee("Shajid", "John", 13);

        /**
         hashmap using custom hashmap class
        **/

        EmployeeHashTable employeeHashTable = new EmployeeHashTable();
        employeeHashTable.put("Rahman", abir);
        employeeHashTable.put("Hasan", nadeem);
        employeeHashTable.put("John", john);

        // print the hashtable
        employeeHashTable.printHashTable();

        // print a hashtable value
        System.out.println("Retrieve key abir : " + employeeHashTable.get("Rahman"));


        /**
         hashmap using JDK
         **/

        Map<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put("Rahman", abir);
        hashMap.put("Hasan", nadeem);

        // print the hashmap values
        Iterator<Employee> iterator = hashMap.values().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // print using lamda function
        hashMap.forEach((k,v) -> System.out.println("key: " +k+ "employee name: "+v.getFirstName()));

        // check if hashmap contains a value
        System.out.println(hashMap.containsValue(abir));

        // check if hashmap contains a key
        System.out.println(hashMap.containsKey("Rahman"));

        // only put value if the key is not present.
        // normally hashmap replace the previous key value pair if a same key value is put
        hashMap.putIfAbsent("Rahman", abir);

        // get value from hashmap
        System.out.println(hashMap.get(abir));

        // remove pair from hashmap
        System.out.println(hashMap.remove(nadeem));

    }
}
