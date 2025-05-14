package com.example.DesignPatterns.creational.prototype;

public class Circle implements Shape {

    private String color;

    public Circle() {
        this.color = "Red"; // Default color
    }

    @Override
    public void draw() {
        System.out.println("Drawing a "+ this.color +" Circle");
    }

    @Override
    public Shape clone() {
        return new Circle();
    }
}
