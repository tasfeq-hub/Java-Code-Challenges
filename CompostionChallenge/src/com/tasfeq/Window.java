package com.tasfeq;

public class Window {

    private double height;
    private double width;
    private String type;

    public Window(double height, double width, String type) {
        this.height = height;
        this.width = width;
        this.type = type;
    }

    private double getHeight() {
        return height;
    }

    private double getWidth() {
        return width;
    }

    private String getType() {
        return type;
    }

    public void getWindowHeight(){
        getHeight();
    }

    public void getWindowType(){
        getType();
    }

}
