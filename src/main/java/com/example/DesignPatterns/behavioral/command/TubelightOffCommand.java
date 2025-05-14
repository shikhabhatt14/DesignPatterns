package com.example.DesignPatterns.behavioral.command;

public class TubelightOffCommand implements Command{

    private Tubelight tubelight;

    public TubelightOffCommand(Tubelight tubelight) {
        this.tubelight = tubelight;
    }

    @Override
    public void execute() {
        tubelight.turnOff();
    }
}
