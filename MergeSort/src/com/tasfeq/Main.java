package com.tasfeq;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = {1,4,2,4,5,66,3,2,31,24};

        mergeSort(unsortedArray,0,unsortedArray.length);

        // print the array
        for (int i=0;i<unsortedArray.length; i++){
            System.out.println(unsortedArray[i]);
        }

    }

    public static void mergeSort(int[] inputArray, int start, int end){

        if(end-start<2){
            return;
        }

        int mid = (start+end)/2;

        mergeSort(inputArray, start, mid); // divide left array
        mergeSort(inputArray, mid, end); // divide right array

        merge(inputArray,start,mid,end);

    }

    public static void merge(int[] inputArray, int start, int mid, int end){

        // all elements in the left partition is less than the elements of the right partition
        if(inputArray[mid-1] <= inputArray[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start]; // temporary array to hold the merged array

        while(i<mid && j<end){
            temp[tempIndex++] = inputArray[i] <= inputArray[j] ? inputArray[i++] : inputArray[j++];
        }

        System.arraycopy(inputArray, i, inputArray, start + tempIndex, mid-i);
        System.arraycopy(temp, 0, inputArray, start, tempIndex);

    }
}
