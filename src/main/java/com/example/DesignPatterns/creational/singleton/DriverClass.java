package com.example.DesignPatterns.creational.singleton;

public class DriverClass {

    public static void main(String[] args)
    {
        Singleton.getInstance().doSomething();
        SingletonUsingDoubleCheckedLocking.getInstance().doSomething();
    }

}
