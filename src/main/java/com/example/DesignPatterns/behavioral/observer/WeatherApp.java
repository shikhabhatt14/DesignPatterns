package com.example.DesignPatterns.behavioral.observer;

public class WeatherApp {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        TVDisplay tvDisplay = new TVDisplay();

        weatherStation.registerObserver(phoneDisplay);
        weatherStation.registerObserver(tvDisplay);

        weatherStation.setWeather("Sunny");
        weatherStation.setWeather("Rainy");
    }

}
