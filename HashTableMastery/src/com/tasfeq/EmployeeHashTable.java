package com.tasfeq;

public class EmployeeHashTable {

    private StoredEmployee[] hashtable;

    public EmployeeHashTable(){

        hashtable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee){

        int hashedKey = hashKey(key);

        if(occupied(hashedKey)){

            int stopIndex = hashedKey;

            if(hashedKey==hashtable.length -1){
                hashedKey = 0;
            }else{
                hashedKey++;
            }

            while(occupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = (hashedKey+1) % hashtable.length;
            }
        }

        if (occupied(hashedKey)){
            System.out.println("Sorry already an employee exists in that position of hashtable!!" + hashedKey);
        }else{
            hashtable[hashedKey] = new StoredEmployee(key,employee);
        }

    }

    public Employee get(String key){

        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }else{
            return hashtable[hashedKey].employee;
        }

    }

    public Employee remove(String key){

        int hashedKey= findKey(key);
        if(hashedKey == -1){
            return null;
        }else{
            Employee employee = hashtable[hashedKey].employee;
            hashtable[hashedKey] = null;
            return  employee;
        }
    }

    private int hashKey(String key){

        return key.length() % hashtable.length;
    }

    private int findKey(String key){

        int hashedKey = hashKey(key);

        if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }


        int stopIndex = hashedKey;

        if(hashedKey==hashtable.length -1){
            hashedKey = 0;
        }else{
            hashedKey++;
        }

        while(hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].key.equals(key)){
            hashedKey = (hashedKey+1) % hashtable.length;
        }

        if(stopIndex == hashedKey){
            return -1;
        }else{
            return hashedKey;
        }

    }

    private boolean occupied(int index){

        return hashtable[index] != null;
    }

    public void printHashTable(){

        for(int i=0; i<hashtable.length; i++){

            if(hashtable[i] == null){
                System.out.println("Empty");
            }else{
                System.out.println(hashtable[i].employee);
            }
        }
    }
}
