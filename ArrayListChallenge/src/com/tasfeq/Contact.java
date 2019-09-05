package com.tasfeq;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact {

    private ArrayList<String> myContacts = new ArrayList<String>();

    public ArrayList<String> getMyContacts() {

        return myContacts;
    }

    public void addContact(String name){

        myContacts.add(name);
    }

    public String getContact(int index){

        return myContacts.get(index);
    }

    public boolean findContact(String name){

        if(myContacts.contains(name)){
            return true;
        }else{
            return false;
        }
    }

    public void removeContact(String name){

        boolean isListed = myContacts.contains(name);
        int contactIndex;
        if(isListed){
            contactIndex = myContacts.indexOf(name);
            myContacts.remove(contactIndex);
            System.out.println("Contact : "+name+" is removed from list! ");
        }else{
            System.out.println("Contact does not exists! ");
        }
    }

    public void updateContact(String name){

        boolean isListed = myContacts.contains(name);
        if(isListed){
            int contactIndex = myContacts.indexOf(name);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter new contact name: ");
            myContacts.set(contactIndex,scanner.nextLine());
        }else {
            System.out.println("Some error occured!");
        }
    }

}
