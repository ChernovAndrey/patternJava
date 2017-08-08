/**
 * Created by andrey on 28.07.17.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print("Silence");
    }
}
