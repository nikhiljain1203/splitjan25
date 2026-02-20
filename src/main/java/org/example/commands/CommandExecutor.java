package org.example.commands;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CommandExecutor {
    private List<Command> commands = new ArrayList<>();

    public CommandExecutor(SettleUpUser settleUpUser) {
        this.commands.add(settleUpUser);
    }

    public void registerCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    public void execute(String input) {
        for(Command command : commands) {
            if(command.matches(input)) {
                command.execute(input);
                break;
            }
        }
    }
}
