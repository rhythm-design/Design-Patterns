package command.util;

import java.util.List;

public class RideReceiver {

    public void cancelRide(){
        System.out.println("User requested cancellation of ride, cancelling...");
    }

    public void requestRide(){
        System.out.println("Requesting the ride");
    }

    public void scheduleRide(){
        System.out.println("Scheduling the ride");
    }

    public void addStop(String start, String end){
        System.out.println("User requested ride from " + start + " to " + end);
    }
}
