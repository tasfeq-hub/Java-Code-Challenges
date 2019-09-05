package com.tasfeq;

public class Door {

    private double height;
    private double width;
    private String type;
    private String color;

    public Door(double height, double width, String type, int cost, String color) {
        this.height = height;
        this.width = width;
        this.type = type;
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
