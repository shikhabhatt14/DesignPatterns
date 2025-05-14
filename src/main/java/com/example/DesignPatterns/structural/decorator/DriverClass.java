package com.example.DesignPatterns.structural.decorator;

public class DriverClass {

    public static void main(String[] args) {

        // Create a simple circle
        Shape circle = new Circle();
        circle.draw();

        System.out.println("---------------------");

        // Create a circle and decorate it with red color
        ShapeDecorator redCircle = new RedColorDecorator(circle);
        redCircle.draw();

        System.out.println("---------------------");

        // Create a rectangle and decorate it with green color
        Shape triangle = new Triangle();
        ShapeDecorator greenTriangle = new GreenColorDecorator(triangle);
        greenTriangle.draw();

        System.out.println("---------------------");
    }

}
