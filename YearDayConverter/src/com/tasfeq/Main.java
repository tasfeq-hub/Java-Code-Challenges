package com.tasfeq;

public class Main {

    public static final String ErrorMessage = "Invalid Value";
    public static final long yearInMinute = 525600;
    public static final long dayInMinute = 1440;

    public static void main(String[] args) {
        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println(ErrorMessage);
        }else{
            long year = minutes / yearInMinute;
            long remainingMinutes = minutes % yearInMinute;
            long day = remainingMinutes / dayInMinute;

            System.out.println(minutes+ " min = "+year+" y and "+day+" d");

        }
    }
}
