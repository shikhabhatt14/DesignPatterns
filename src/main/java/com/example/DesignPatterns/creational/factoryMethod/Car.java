package com.example.DesignPatterns.creational.factoryMethod;

public class Car implements MotorVehicle{

    @Override
    public void build() {
        System.out.println("Build Car");
    }

}
