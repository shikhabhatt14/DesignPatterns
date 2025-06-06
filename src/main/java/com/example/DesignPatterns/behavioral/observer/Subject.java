package com.example.DesignPatterns.behavioral.observer;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
