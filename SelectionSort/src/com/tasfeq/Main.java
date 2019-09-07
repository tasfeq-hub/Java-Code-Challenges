package com.tasfeq;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = {29,31,22,11,242,112,3};

        for(int lastSortedIndex=unsortedArray.length-1; lastSortedIndex>0; lastSortedIndex--){

            int largestIndex = 0;

            for(int i=0;i<=lastSortedIndex;i++){

                if(unsortedArray[i]>unsortedArray[largestIndex]){
                    largestIndex = i;
                }
            }

            swap(unsortedArray,largestIndex,lastSortedIndex);
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
