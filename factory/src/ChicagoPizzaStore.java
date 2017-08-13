/**
 * Created by andrey on 13.08.17.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        //... another Pizzas
        return null;
    }
}
