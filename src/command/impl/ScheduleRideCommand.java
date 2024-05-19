package command.impl;

import command.Command;
import command.util.RideReceiver;

public class ScheduleRideCommand implements Command {

    private RideReceiver rideReceiver;

    public ScheduleRideCommand(RideReceiver rideReceiver) {
        this.rideReceiver = rideReceiver;
    }

    @Override
    public void execute() {
        rideReceiver.scheduleRide();
    }
}
