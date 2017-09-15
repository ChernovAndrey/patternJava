package controller;

import actions.Command;
import actions.NoCommand;

/**
 * Created by andrey on 13.09.17.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    public RemoteControl(){
        onCommands = new Command[3];
        offCommands = new Command[3];

        final Command noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i]= noCommand;
            offCommands[i]=noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand= onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand= onCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
    @Override
    public String toString(){
         final StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("\n-------RemoteControl---------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i
                    + onCommands[i].getClass().getName()
                    +
            "       "+ offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
