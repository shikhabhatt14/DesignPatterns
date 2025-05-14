package com.example.DesignPatterns.behavioral.command;

public class RemoteControl {

    Command button;

    public RemoteControl(Command button) {
        this.button = button;
    }

    public void pressButton() {
        button.execute();
    }

}
