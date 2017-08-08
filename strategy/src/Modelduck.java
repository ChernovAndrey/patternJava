/**
 * Created by andrey on 28.07.17.
 */
public class Modelduck extends Duck{
    public Modelduck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("I am a model duck");
    }

}
