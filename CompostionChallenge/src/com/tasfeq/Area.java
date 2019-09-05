package com.tasfeq;

public class Area {

    private double height;
    private double width;

    public Area(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double areaCalculation(){
        return (this.height*this.width);
    }

}
