package com.example.DesignPatterns.structural.adapter;

public class ClientClass {

    public static void main(String[] args) {
        Printer printer = new PrintAdapter();
        printer.print("Hello, World!");

        // You can also use the legacy printer directly if needed
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        legacyPrinter.printDocument("Directly using Legacy Printer: Hello, World!");
    }

}
