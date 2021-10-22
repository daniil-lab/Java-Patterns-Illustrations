package Command;

import Command.main.SimpleRemoteControl;
import Command.main.commands.light.Light;
import Command.main.commands.light.LightOnCommand;

/*
    Паттерн Команда инкапсулирует запрос в виде
    объекта, делая возможной параметризацию кли-
    ентских объектов с другими запросами, органи-
    зацию очереди или регистрацию запросов, а так-
    же поддержку отмены операций.
 */

public class CommandMain {
    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();

        LightOnCommand lightOnCommand = new LightOnCommand(new Light());

        control.setCommand(lightOnCommand);
        control.buttonWasPressed();
    }
}
