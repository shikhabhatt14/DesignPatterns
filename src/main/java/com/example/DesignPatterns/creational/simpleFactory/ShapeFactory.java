package com.example.DesignPatterns.creational.simpleFactory;

import java.awt.*;

public class ShapeFactory {

    public static Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        switch(shapeType){
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }

}
