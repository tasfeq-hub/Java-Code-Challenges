package com.tasfeq;

public class Main {

    public static void main(String[] args) {
        isPalindrome(12321);
    }

    public static boolean isPalindrome(int number){
        int count = 0;
        int reverseNumber=0;
        double remainder;
        int temp = number;

        while(temp!=0){
            temp = temp/10;
            count++;
        }
        temp=number;

        for(int i=count;i>0;i--){
            remainder = (number%10)*Math.pow(10,i-1);
            reverseNumber +=remainder;
            number=number/10;
        }

        if(reverseNumber==temp){
            System.out.println("true");
            return true;
        }else {
            System.out.println("false");
            return false;
        }
    }

}
