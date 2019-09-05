package com.tasfeq;

public class Main {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2050);
    }

    public static void printMegaBytesAndKiloBytes(int KiloBytes){

        if(KiloBytes>0){
            int kilo = (KiloBytes%1024);
            int mega = (KiloBytes/1024);
            System.out.println(KiloBytes+" KB = " +mega+" MB and "+kilo+" KB" );
        }else{
            System.out.println("Invalid Value.");
        }

    };
}
