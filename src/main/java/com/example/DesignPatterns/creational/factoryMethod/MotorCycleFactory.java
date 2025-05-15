package com.example.DesignPatterns.creational.factoryMethod;

public class MotorCycleFactory extends MotorVehicleFactory {

    @Override
    protected MotorVehicle createMotorVehicle() {
        return new MotorCycle();
    }

    @Override
    public String toString() {
        return "MotorCycleFactory{}";
    }
}
