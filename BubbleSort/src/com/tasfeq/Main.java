package com.tasfeq;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = {29,31,22,11,242,112,3};

        for (int lastUnsortedIndex = unsortedArray.length -1; lastUnsortedIndex>0; lastUnsortedIndex--){
            for (int i=0; i<lastUnsortedIndex; i++){
                if(unsortedArray[i]>unsortedArray[i+1]){
                    swap(unsortedArray,i,i+1);
                }
            }
        }

        // print the sorted array
        for (int i=0; i<unsortedArray.length;i++){
            System.out.println(unsortedArray[i]);
        }

    }

    public static void swap(int[] array, int i, int j){

        if(i==j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
