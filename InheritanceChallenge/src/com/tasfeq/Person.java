package com.tasfeq;

public class Person {

    private String name;
    private String age;
    private String gender;
    private String address;
    private double height;
    private double weight;

    public Person(String name, String age, String gender, String address, double height, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void isEducated(boolean education){
        if(education){
            System.out.println("This person is educated!");
        }else{
            System.out.println("This person is not educated");
        }
    }

    public boolean canDrive(boolean driver){
        if(driver){
            return true;
        }else{
            return false;
        }
    }

}
