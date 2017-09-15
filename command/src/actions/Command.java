package actions;

/**
 * Created by andrey on 13.09.17.
 */
public interface Command {
    void execute();
    void undo();
}
