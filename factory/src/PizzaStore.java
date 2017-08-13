import javax.swing.*;

/**
 * Created by andrey on 13.08.17.
 */
public abstract  class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);

}
