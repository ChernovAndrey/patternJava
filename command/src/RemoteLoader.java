import actions.Command;
import actions.LightOffCommand;
import actions.LightOnCommand;
import actions.MacroCommand;
import controller.RemoteControl;
import subjects.Light;

/**
 * Created by andrey on 13.09.17.
 */
public class RemoteLoader {
    public static void main(String[] args) {
        final RemoteControl remoteControl = new RemoteControl();
        final Light light = new Light();
        final LightOnCommand lightOnCommand = new LightOnCommand(light);
        final LightOffCommand lightOffCommand = new LightOffCommand(light);

        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        System.out.println("pushing macro");

        final Command[] partyOn = {lightOnCommand, lightOnCommand,lightOnCommand};
        final Command[] partyOff = {lightOffCommand, lightOffCommand,lightOffCommand};

        final MacroCommand macroCommandOn = new MacroCommand(partyOn);
        final MacroCommand macroCommandOff = new MacroCommand(partyOff);

        remoteControl.setCommand(1,macroCommandOn,macroCommandOff);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

    }
}
