package com.tasfeq;

public class Main {

    public static void main(String[] args) {
	    setSum();
    }

    public static void setSum(){
        int sum = 0;
        int count = 0;

        for (int i=1;i<=1000;i++){
            if(isDivisible(i)){
                System.out.println(i+" is divisible by 3 and 5 ");
                sum+=i;
                count++;
                if(count==5){
                    break;
                }
            }
        }
        System.out.println("Total is "+sum);
    }

    private static boolean isDivisible(int number){
        if(number%3==0 && number%5==0){
            return true;
        }else{
            return false;
        }

    }
}
