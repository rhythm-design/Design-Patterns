package command.invoker;

import command.Command;
import command.util.RideRequest;

public class RideInvoker {

    private final RideRequest rideRequest;

    public RideInvoker(RideRequest rideRequest) {
        this.rideRequest = rideRequest;
    }

    public void executeAll(){
        for(Command command: rideRequest.getCommands()){
            command.execute();
        }
    }
}
