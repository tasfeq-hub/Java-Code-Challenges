package com.tasfeq;

public class Main {

    static int sum;
    static boolean flag = true;

    public static void main(String[] args) {
        int result= sumDigits(2346);
        System.out.println("The sum of the digits is: "+result);
    }

    public static int sumDigits(int number){

        if(number>=10){
            while(flag){
                if(number<10){
                    flag=false;
                }
                setSumOfDigit(number);
                number = setNewNumber(number);
            }
            return sum;
        }else{
            return -1;
        }
    }

    private static void setSumOfDigit(int number){
        sum += number%10;
    }

    private static int setNewNumber(int number){
        return number/10;
    }
}
