/**
 * Created by andrey on 28.07.17.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        final Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        final Duck model = new Modelduck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
