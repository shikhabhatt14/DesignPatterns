package com.example.DesignPatterns.creational.abstractFactory;

public class Store {

    public static void main(String[] args) {
        // Create an Apple factory
        Factory appleFactory = new AppleFactory();
        Phone applePhone = appleFactory.getPhone();
        Tablet appleTablet = appleFactory.getTablet();

        // Display specifications
        System.out.println("Apple Products:");
        applePhone.specification();
        appleTablet.specification();

        // Create a Samsung factory
        Factory samsungFactory = new SamsungFactory();
        Phone samsungPhone = samsungFactory.getPhone();
        Tablet samsungTablet = samsungFactory.getTablet();

        // Display specifications
        System.out.println("\nSamsung Products:");
        samsungPhone.specification();
        samsungTablet.specification();
    }

}
