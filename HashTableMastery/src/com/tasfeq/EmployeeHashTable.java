package com.tasfeq;

public class EmployeeHashTable {

    private Employee[] hashtable;

    public EmployeeHashTable(){

        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee){

        int hashedKey = hashKey(key);

        if (hashtable[hashedKey] != null){
            System.out.println("Sorry already an employee exists in that position of hashtable!!" + hashedKey);
        }else{
            hashtable[hashedKey] = employee;
        }

    }

    public Employee get(String key){

        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    private int hashKey(String key){

        return key.length() % hashtable.length;
    }

    public void printHashTable(){

        for(int i=0; i<hashtable.length; i++){
            System.out.println(hashtable[i]);
        }
    }
}
