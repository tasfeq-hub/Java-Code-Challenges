package com.tasfeq;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // integer array
        int[] intArray = new int[10];
        intArray[0] = 20;
        intArray[9] = -222;

        for (int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }


        // String array
        String[] stringArray = new String[10];
        stringArray[2]="Hello";
        stringArray[3]="World";

        for (int i=0; i<stringArray.length; i++){
            System.out.println(stringArray[i]);
        }


        // add an element to a full array
        int[] arrayOne = new int[5];
        int[] arrayTwo = new int[arrayOne.length +1];

        for (int i=0;i<arrayOne.length;i++){
            arrayTwo[i]=arrayOne[i];
        }

        arrayTwo[arrayTwo.length-1]= 10;
        arrayOne = arrayTwo;

        for (int i=0; i<arrayOne.length; i++){
            System.out.println(arrayOne[i]);
        }


        // get the index value of a array based on value
        int index = -1;
        for(int i=0; i<intArray.length; i++){
            if( intArray[i]==-222){
                index=i;
                break;
            }
        }
        System.out.println("Index of value -222 is >> " +index);


        // copy an array from another array
        int[] x = new int[] {1,2};
        int[] y = Arrays.copyOf(x,x.length+1);

        for (int i=0; i<y.length; i++){
            System.out.println(y[i]);
        }


        // insert an element into an array
        int[] a = new int[] {1,2,3,4,5,6,7,8,9};
        int position = 5;
        int newValue = 10;

        for(int i=a.length-1; i > position; i--){
            a[i] = a[i-1];
        }
        a[position] = newValue;
        System.out.println("The new Array is >> "+Arrays.toString(a));


        // delete an index value from array
        int[] oldArray = new int[] {1,2,3,4,5,6,7,8,9,10};
        int[] newArray = Arrays.copyOf(oldArray,oldArray.length-1);

        Scanner sc = new Scanner(System.in);
        int deleteIndex = sc.nextInt();

        for (int i=newArray.length-1; i>=deleteIndex; i--){
            newArray[i]=oldArray[i+1];
        }

        for (int i=0; i<newArray.length; i++){
            System.out.println(newArray[i]);
        }


    }
}
