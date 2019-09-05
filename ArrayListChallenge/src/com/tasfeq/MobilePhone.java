package com.tasfeq;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<String> contactList;
    Contact contact = new Contact();

    public void printAllContacts(){

        contactList = contact.getMyContacts();
        for(int i=0;i<=contactList.size()-1;i++){
            System.out.println("Your contacts are :\n"+contact.getContact(i));
        }
    }

    public void addContact(String name){

        contact.addContact(name);
    }

    public boolean searchContact(String name){

        if(contact.findContact(name)){
            return true;
        }else {
            return false;
        }
    }

    public void removeContact(String name){

        contact.removeContact(name);
    }

    public void updateContact(String name){

        contact.updateContact(name);
    }
}
