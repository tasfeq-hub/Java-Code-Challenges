package com.tasfeq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count=1;
        int sum=0;

        while(count<=10){
            System.out.println("Enter number #"+count+":");
            if(scanner.hasNextInt()){
                sum+=scanner.nextInt();
                count++;
            }else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Total sum is: "+sum);
    }
}
