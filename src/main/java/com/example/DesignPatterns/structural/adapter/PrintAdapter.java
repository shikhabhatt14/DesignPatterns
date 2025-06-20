package com.example.DesignPatterns.structural.adapter;

public class PrintAdapter implements Printer{

    @Override
    public void print(String document) {
       LegacyPrinter legacyPrinter = new LegacyPrinter();
         legacyPrinter.printDocument(document);
    }

}
