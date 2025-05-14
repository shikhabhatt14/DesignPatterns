package com.example.DesignPatterns.behavioral.command;

public class RadioVolumeCommand implements Command{

    private Radio radio;

    public RadioVolumeCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.setVolume(7);
    }

}
