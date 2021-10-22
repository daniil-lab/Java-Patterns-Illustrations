package Command.main.commands.light;

import Command.main.Command;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.lightOff();
    }

    @Override
    public String toString() {
        return "LightOffCommand";
    }

    @Override
    public void undo() {
        this.light.lightOn();
    }
}
