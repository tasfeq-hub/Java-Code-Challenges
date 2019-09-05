package com.tasfeq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNumber=0;
        int secondNumber=0;
        int count = 1;

        while(true){
            System.out.println("Please Enter number "+count+":");
            if(scanner.hasNextInt()){
                count++;
                firstNumber=scanner.nextInt();
                System.out.println("Please enter number "+count+":");
                if(scanner.hasNextInt()) {
                    secondNumber=scanner.nextInt();
                    count++;
                }
                if(count>2) break;
            }else {
                break;
            }
            scanner.nextLine();
        }

        if(firstNumber<secondNumber) {
            System.out.println("The minimum number is :"
                    +firstNumber+" and the maximum number is :"+secondNumber);
        }else {
            System.out.println("The minimum number is :"
                    +secondNumber+" and the maximum number is :"+firstNumber);
        }

        scanner.close();
    }
}
