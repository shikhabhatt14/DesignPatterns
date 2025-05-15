package com.example.DesignPatterns.creational.factoryMethod;

public class CarFactory extends MotorVehicleFactory {

    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Car();
    }

    @Override
    public String toString() {
        return "CarFactory{}";
    }
}
