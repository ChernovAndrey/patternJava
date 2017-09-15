package actions;

import subjects.Light;

/**
 * Created by andrey on 13.09.17.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light=light;
    }

   @Override
   public void execute(){
        light.on();
    }

    @Override
    public void undo(){
       light.off();
    }
}
