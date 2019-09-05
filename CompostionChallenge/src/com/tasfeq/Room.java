package com.tasfeq;

public class Room {

    private Area area;
    private String location;
    private Window window;
    private Door door;
    private Furniture furniture;
    private double cost;
    private int capacityPerson;

    public Room(Area area, String location, Window window, Door door, Furniture furniture, double cost, int capacityPerson) {
        this.area = area;
        this.location = location;
        this.window = window;
        this.door = door;
        this.furniture = furniture;
        this.cost = cost;
        this.capacityPerson = capacityPerson;
    }

    public Area getArea() {
        return area;
    }

    public String getLocation() {
        return location;
    }

    public Window getWindow() {
        return window;
    }

    public Door getDoor() {
        return door;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public double getCost() {
        return cost;
    }

    public int getCapacityPerson() {
        return capacityPerson;
    }
}
