package command.impl;

import command.Command;
import command.util.RideReceiver;

import java.util.ArrayList;
import java.util.List;

public class SelectAndAddStopCommand implements Command {

    private final RideReceiver rideReceiver;

    private final String start;

    private final String end;

    public SelectAndAddStopCommand(RideReceiver rideReceiver, String start, String end) {
        this.rideReceiver = rideReceiver;
        this.start = start;
        this.end = end;
    }

    @Override
    public void execute() {
        rideReceiver.addStop(start, end);
    }
}
