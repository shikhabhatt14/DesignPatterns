package com.example.DesignPatterns.behavioral.command;

public class TubelightOnCommand implements Command{

    private Tubelight tubelight;

    public TubelightOnCommand(Tubelight tubelight) {
        this.tubelight = tubelight;
    }

    @Override
    public void execute() {
        tubelight.turnOn();
    }
}
