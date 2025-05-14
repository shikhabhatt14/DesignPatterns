package com.example.DesignPatterns.creational.prototype;

public class ShapePrototypeMainClass {

    public static void main(String[] args) {
        // Create a Circle object
        Shape circle = new Circle();

        // Clone the Circle object using the prototype pattern
        ShapeClient shapeClient = new ShapeClient(circle);

        // Draw the cloned Circle object
        Shape redCircle = shapeClient.drawShape();

        // Set the color of the cloned Circle object
        redCircle.draw();


    }

}
