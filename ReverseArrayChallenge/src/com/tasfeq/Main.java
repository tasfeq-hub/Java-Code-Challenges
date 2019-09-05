package com.tasfeq;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = new int[5];

        System.out.println("Enter 5 values into the Array : ");
        for(int i=0;i<5;i++){
            array[i]=scanner.nextInt();
        }
        int[] reverseArray = reverseArray(array);
        printArray(array,reverseArray);

    }

    private static int[] reverseArray(int[] array){

        int[] reverseArray = new int[array.length];

        for(int i=0;i<=array.length-1;i++){
            reverseArray[i]=array[(array.length-1)-i];
        }

        return reverseArray;
    }

    private static void printArray(int[] mainArray, int[] reverseArray){

        System.out.println("The main array is as follows.. "+ Arrays.toString(mainArray));
        System.out.println("The reverse array is as follows.."+Arrays.toString(reverseArray));
    }

}
