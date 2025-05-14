package com.example.DesignPatterns.behavioral.command;

public class DriverClass {

    public static void main(String[] args) {

        // Create a tubelight object
        Tubelight tubelight = new Tubelight();

        // Create command objects
        Command tubelightOnCommand = new TubelightOnCommand(tubelight);
        Command tubelightOffCommand = new TubelightOffCommand(tubelight);

        // Execute commands
        RemoteControl remoteControlOn = new RemoteControl(tubelightOnCommand);
        remoteControlOn.pressButton();

        RemoteControl remoteControlOff = new RemoteControl(tubelightOffCommand);
        remoteControlOff.pressButton();


        // Create a radio object
        Radio radio = new Radio();

        // Create command objects
        Command radioVolumeCommand = new RadioVolumeCommand(radio);

        // Execute commands
        RemoteControl remoteControlVolume = new RemoteControl(radioVolumeCommand);
        remoteControlVolume.pressButton();
    }

}
