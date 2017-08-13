import java.util.ArrayList;

/**
 * Created by andrey on 13.08.17.
 */
public abstract class Pizza {
    String name;
    String sauce;
    String dough;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (Object topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cuttlng the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }

}
