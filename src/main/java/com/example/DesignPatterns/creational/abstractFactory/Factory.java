package com.example.DesignPatterns.creational.abstractFactory;

public interface Factory {
    // Factory methods to create products
    Phone getPhone();
    Tablet getTablet();

}
