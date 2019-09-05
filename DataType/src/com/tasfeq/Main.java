package com.tasfeq;

public class Main {

    public static void main(String[] args) {

        // int short byte long
        byte byteValue = 101;
        byte computedByte = (byte) (byteValue/2);
        System.out.println(computedByte);
        short shortValue = 20;
        int intValue = 50;
        long longTotal = 50000L + 10 * (byteValue+shortValue+intValue);
        System.out.println("long total is " + longTotal);

        // float and double
        int myIntValue=5;
        float myFloatValue=5f;
        double myDoubleValue=5d;
        System.out.println("int value "+myIntValue);
        System.out.println("float value "+myFloatValue);
        System.out.println("double value "+myDoubleValue);

        // char and boolean
        char myChar = '\u00A9';
        System.out.println(myChar);
        boolean myBoolean = false;
        boolean isMale = true;

        // string
        String myString = " hello world";
        String myAnotherString = myString + " this is concat";
        System.out.println(myAnotherString);
        int count = 10; //****//
        System.out.println(myString+count);
    }
}
