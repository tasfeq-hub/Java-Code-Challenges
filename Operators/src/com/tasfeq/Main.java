package com.tasfeq;

public class Main {

    public static void main(String[] args) {

        int count = 10;
        boolean isMale = true;

        /*
        if(count = 10)
            System.out.println("right");
        */
        if (isMale = false)
            System.out.println("right");
        if (isMale = true)
            System.out.println("right");

        boolean person = isMale? true:false;
        System.out.println(person);

        double myVar = 20;
        double mySecondVar = 80;
        double myResult = myVar+mySecondVar;
        double mySecondResult = myResult*25;
        double myRemainder = myResult % 40;
        if (mySecondResult <=20)
            System.out.println("Total was over the limit");

    }
}
