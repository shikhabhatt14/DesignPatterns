package com.example.DesignPatterns.structural.decorator;

public class GreenColorDecorator extends ShapeDecorator{

   public GreenColorDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        fillColor(decoratedShape);
    }

    private void fillColor(Shape decoratedShape){
        System.out.println("filled Green color");
    }

}
