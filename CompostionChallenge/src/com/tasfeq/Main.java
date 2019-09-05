package com.tasfeq;

public class Main {

    public static void main(String[] args) {

        Window window = new Window(20,40,"Split");
        Door door = new Door(60,25,"Sliding",1000,"White");
        Furniture furniture = new Furniture(2500,"Brown",new Area(10,10));

        Room room = new Room(new Area(300,600),"South",window,door,furniture,
                800,3);

        System.out.println("The area of the Room is : "+room.getArea().areaCalculation());
        System.out.println("The room has a furniture costin : "+room.getFurniture().getCost());
        System.out.println("The room has a door of which the color is : "+room.getDoor().getColor());

        System.out.println("Composition working just fine.....");
    }
}
