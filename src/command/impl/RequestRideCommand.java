package command.impl;

import command.Command;
import command.util.RideReceiver;

public class RequestRideCommand implements Command {

    private RideReceiver rideReceiver;

    public RequestRideCommand(RideReceiver rideReceiver) {
        this.rideReceiver = rideReceiver;
    }


    @Override
    public void execute() {
        rideReceiver.requestRide();
    }
}
