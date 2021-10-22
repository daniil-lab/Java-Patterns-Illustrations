package Command.main.commands.stereo;

import Command.main.Command;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.stereoOff();
    }

    @Override
    public String toString() {
        return "StereoOffCommand";
    }

    @Override
    public void undo() {
        this.stereo.stereoOn();
    }
}
