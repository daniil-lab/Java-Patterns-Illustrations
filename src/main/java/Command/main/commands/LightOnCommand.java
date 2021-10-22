package Command.main.commands;

import Command.main.Command;

public class LightOnCommand implements Command {
    boolean light;

    public LightOnCommand(boolean light) {
        this.light = light;
    }

    public void execute() {
        this.light = true;
    }
}
