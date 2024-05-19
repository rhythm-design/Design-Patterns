package command;

import command.impl.CancelRideCommand;
import command.impl.RequestRideCommand;
import command.impl.ScheduleRideCommand;
import command.impl.SelectAndAddStopCommand;
import command.invoker.RideInvoker;
import command.util.RideReceiver;
import command.util.RideRequest;

public class CommandRunner {

    public static void main(String[] args) {
        RideReceiver rideReceiver = new RideReceiver();

        // Journey of customer for selecting a ride
        Command selectStops = new
                SelectAndAddStopCommand(rideReceiver, "Church Street", "Marathalli");

        Command requestRideCommand = new RequestRideCommand(rideReceiver);

        Command scheduleRide = new ScheduleRideCommand(rideReceiver);

        Command cancelRide = new CancelRideCommand(rideReceiver);
        // Here customer jouney finishes, have selected all the required details

        RideRequest rideRequest = new RideRequest();
        rideRequest.addCommands(selectStops);
        rideRequest.addCommands(requestRideCommand);
        rideRequest.addCommands(scheduleRide);
        rideRequest.addCommands(cancelRide);

        RideInvoker rideInvoker = new RideInvoker(rideRequest);
        rideInvoker.executeAll();
    }
}
