package com.tasfeq;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int count;
        int[] inputArray = new int[1000];
        int[] sortedArray = new int[1000];

        System.out.println("How many numbers ?");
        count=scanner.nextInt();
        inputArray = getInteger(count);
        sortedArray = sortInteger(inputArray);
        printArray(sortedArray);

    }

    public static int[] getInteger(int count){

        int[] array = new int[count];
        System.out.println("Insert the numbers..");
        for(int i=0;i<count;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static int[] sortInteger(int[] array){

        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]<array[j+1]){
                  int temp = array[j];
                  array[j]=array[j+1];
                  array[j+1]=temp;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array){

        System.out.println("The sorted Array is following...\n");
        for(int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }

}
