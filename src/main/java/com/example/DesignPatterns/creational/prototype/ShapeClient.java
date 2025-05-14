package com.example.DesignPatterns.creational.prototype;

public class ShapeClient {

 private Shape shapePrototype;

    public ShapeClient(Shape shapePrototype) {
        this.shapePrototype = shapePrototype;
    }

    public Shape drawShape(){
        return shapePrototype.clone();
    }

}
