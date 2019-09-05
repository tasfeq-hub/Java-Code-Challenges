package com.tasfeq;

public class Furniture {

    private double cost;
    private String color;
    private Area area;

    public Furniture(double cost, String color, Area area) {
        this.cost = cost;
        this.color = color;
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    public Area getArea() {
        return area;
    }
}
