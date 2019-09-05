package com.tasfeq;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        printInstruction();
        getUserInput();

    }

    public static void printInstruction(){

        System.out.println("Please follow the instruction \n");
        System.out.println("Press 1 to Add Contact \n");
        System.out.println("Press 2 to View all Contacts \n");
        System.out.println("Press 3 to Update a Contact \n");
        System.out.println("Press 4 to Remove a Contact \n");
        System.out.println("Press 5 to Search a Contact \n");
        System.out.println("Press 6 to Exit Program \n");

    }

    public static void getUserInput(){

        boolean flag = true;
        while(flag){

            int userInput=scanner.nextInt();
            scanner.nextLine();

            switch (userInput){

                case 1:
                    System.out.println("Add Contact Name");
                    mobilePhone.addContact(scanner.nextLine());
                    break;

                case 2:
                    System.out.println("View all Contacts");
                    mobilePhone.printAllContacts();
                    break;

                case 3:
                    System.out.println("Update Contact Name");
                    mobilePhone.updateContact(scanner.nextLine());
                    break;

                case 4:
                    System.out.println("Remove Contact");
                    mobilePhone.removeContact(scanner.nextLine());
                    break;

                case 5:
                    System.out.println("Search if Contact exists");
                    if(mobilePhone.searchContact(scanner.nextLine())){
                        System.out.println("Contact Found");
                    }else {
                        System.out.println("Contact not found!");
                    }
                    break;

                case 6:
                    System.out.println("Bye!");
                    flag = false;
                    break;
            }

        }
        scanner.close();
    }
}
