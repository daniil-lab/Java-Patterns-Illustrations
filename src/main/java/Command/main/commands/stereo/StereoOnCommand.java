package Command.main.commands.stereo;

import Command.main.Command;

public class StereoOnCommand implements Command {
    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.stereoOn();
    }

    @Override
    public String toString() {
        return "StereoOnCommand";
    }

    @Override
    public void undo() {
        this.stereo.stereoOff();
    }
}
