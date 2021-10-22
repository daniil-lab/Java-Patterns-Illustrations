package Command.main.commands.light;

import Command.main.Command;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.switchLight();
    }
}
