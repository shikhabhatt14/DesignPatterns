package com.example.DesignPatterns.creational.abstractFactory;

public class AppleFactory implements Factory {
    @Override
    public Phone getPhone() {
        return new Iphone16();
    }

    @Override
    public Tablet getTablet() {
        return new Ipad11();
    }
}
