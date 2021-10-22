package Command;

import Command.main.SimpleRemoteControl;
import Command.main.commands.light.Light;
import Command.main.commands.light.LightOffCommand;
import Command.main.commands.light.LightOnCommand;
import Command.main.commands.stereo.Stereo;
import Command.main.commands.stereo.StereoOffCommand;
import Command.main.commands.stereo.StereoOnCommand;
import Command.main.control.RemoteControl;

/*
    Паттерн Команда инкапсулирует запрос в виде
    объекта, делая возможной параметризацию кли-
    ентских объектов с другими запросами, органи-
    зацию очереди или регистрацию запросов, а так-
    же поддержку отмены операций.
 */

public class CommandMain {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Stereo stereo = new Stereo();

        LightOffCommand lightOffCommand =
                new LightOffCommand(light);

        LightOnCommand lightOnCommand =
                new LightOnCommand(light);

        StereoOffCommand stereoOffCommand =
                new StereoOffCommand(stereo);

        StereoOnCommand stereoOnCommand =
                new StereoOnCommand(stereo);

        remoteControl.setCommand(0, stereoOnCommand, stereoOffCommand);
        remoteControl.setCommand(1, lightOnCommand, lightOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);

        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();

        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);

        System.out.println(remoteControl);

    }
}
