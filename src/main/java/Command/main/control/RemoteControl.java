package Command.main.control;

import Command.main.Command;
import Command.main.commands.noCommand.NoCommand;

public class RemoteControl {
    private Command[] onCommands;

    private Command[] offCommands;

    private Command undoCommand;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }

        this.undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
        this.undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
        this.undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        this.undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder remoteControlData = new StringBuilder("----- Remote Control -----\n");

        for (int i = 0; i < 7; i++)
            remoteControlData.append("[slot %d] %s \t\t %s\n".formatted(i, this.onCommands[i], this.offCommands[i]));

        remoteControlData.append("[undo slot] %s".formatted(undoCommand));

        return remoteControlData.toString();
    }
}
