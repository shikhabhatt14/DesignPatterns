package com.example.DesignPatterns.behavioral.command;

public class Radio {
    public void turnOn() {
        System.out.println("Radio is ON");
    }

    public void turnOff() {
        System.out.println("Radio is OFF");
    }

    public void setVolume(int volume) {
        System.out.println("Radio volume set to " + volume);
    }
}
