package com.tasfeq;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = {1,4,3,-1,7,2,5};

        for(int firstUnsortedIndex=1; firstUnsortedIndex<unsortedArray.length; firstUnsortedIndex++){

            int insertionValue = unsortedArray[firstUnsortedIndex];

            int j;

            for(j=firstUnsortedIndex; j>0 && unsortedArray[j-1]>insertionValue; j--){
                unsortedArray[j] = unsortedArray[j-1];
            }

            unsortedArray[j] = insertionValue;
        }

        // print the sorted array
        for (int i=0; i<unsortedArray.length;i++){
            System.out.println(unsortedArray[i]);
        }
    }

}
