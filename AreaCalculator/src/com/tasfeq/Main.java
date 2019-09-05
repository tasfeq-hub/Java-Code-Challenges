package com.tasfeq;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double circleArea =area(14);
        double rectangleArea =area(12,22);
        System.out.println(circleArea);
        System.out.println(rectangleArea);
    }

    public static double area(double radius){
        double totalArea;

        if(radius<0){
            return -1.0;
        }else{
            totalArea = radius*radius*3.14159;
            return totalArea;
        }

    };

    public static double area(double length, double width){
        double totalArea;

        if(length<0 || width<0 ){
            return -1.0;
        }else{
            return length*width;
        }
    }
}
