package com.tasfeq;

class Audi extends Car{

    public Audi(String name, int cylinderCount) {
        super(name, true, 4, cylinderCount);
    }

    public String brake(){
        return "Audi breaking system in action..";
    }
}

class Bmw extends Car{

    public Bmw(String name, int cylinderCount) {
        super(name, true, 4, cylinderCount);
    }

    public String brake(){
        return "BMW breaking system in action..";
    }
}

class Volvo extends Car{

    public Volvo(String name, int cylinderCount) {
        super(name, true, 4, cylinderCount);
    }

    public String brake(){
        return "Volvo breaking system in action..";
    }
}


class Car{

    private String name;
    private boolean engine;
    private int wheel;
    private int cylinderCount;

    public Car(String name, boolean engine, int wheel, int cylinderCount) {
        this.name = name;
        this.engine = engine;
        this.wheel = wheel;
        this.cylinderCount = cylinderCount;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheel() {
        return wheel;
    }

    public int getCylinderCount() {
        return cylinderCount;
    }

    public void startEngine(){
        System.out.println("Engine has started... voom voommmmm");
    }

    public void accelerate(){
        System.out.println("Accelerating...........");
    }

    public String brake(){
        return "Brake initiated !!";
    }
}



public class Main {

    public static void main(String[] args) {

        for(int i=0;i<5;i++){
            Car car = randomCar();
            System.out.println("Brake pressed!"+i+"\n"+car.brake());
        }

    }

    public static Car randomCar(){

        int randomNumber = (int)(Math.random()*5);
        System.out.println(randomNumber);

        switch(randomNumber){
            case 1:
                return new Audi("Audi a6",6);
            case 2:
                return new Volvo("Volvo s-12",4);
            case 3:
                return new Bmw("BMW M6 2018",12);

                default:return new Car("Toyota",true,4,4);
        }
    }
}
