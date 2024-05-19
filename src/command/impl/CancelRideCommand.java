package command.impl;

import command.Command;
import command.util.RideReceiver;

public class CancelRideCommand implements Command {

    private RideReceiver rideReceiver;

    public CancelRideCommand(RideReceiver rideReceiver) {
        this.rideReceiver = rideReceiver;
    }

    @Override
    public void execute() {
        rideReceiver.cancelRide();
    }
}
