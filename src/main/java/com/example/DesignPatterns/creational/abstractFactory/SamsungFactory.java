package com.example.DesignPatterns.creational.abstractFactory;

public class SamsungFactory implements Factory{
    @Override
    public Phone getPhone() {
        return new GalaxyS23();
    }

    @Override
    public Tablet getTablet() {
        return new GalaxyTabS10();
    }
}
