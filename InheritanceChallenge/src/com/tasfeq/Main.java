package com.tasfeq;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Rafi","25", "Male", 5.6,70,"10323",
                "101A",889);

        System.out.println("The name of the student is "+student.getName());
        System.out.println("The weight is: "+student.getWeight());
        System.out.println("And the student is "+ student.getGender());
        student.graduate();

    }
}
