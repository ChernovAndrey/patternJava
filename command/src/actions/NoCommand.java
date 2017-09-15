package actions;

/**
 * Created by andrey on 13.09.17.
 */
public class NoCommand implements Command{

    @Override
    public void execute() {
        System.out.println("not init");
    }

    @Override
    public void undo() {

    }
}
