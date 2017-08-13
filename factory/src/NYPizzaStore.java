/**
 * Created by andrey on 13.08.17.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        //... another Pizzas
        return null;
    }
}
