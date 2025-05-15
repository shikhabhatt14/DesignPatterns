package com.example.DesignPatterns.behavioral.observer;

public class TVDisplay implements Observer{

    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    public void display() {
        System.out.println("TV Display -> Current Weather: " + weather);
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
