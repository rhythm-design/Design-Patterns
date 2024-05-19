package command.util;

import command.Command;

import java.util.ArrayList;
import java.util.List;

public class RideRequest {

    private final List<Command> commandList = new ArrayList<>();

    public void addCommands(Command command){
        commandList.add(command);
    }

    public List<Command> getCommands(){
        return this.commandList;
    }
}
