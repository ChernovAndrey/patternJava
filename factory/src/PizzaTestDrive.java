/**
 * Created by andrey on 13.08.17.
 */
public class PizzaTestDrive {
        public static void main(String[] args) {
            final PizzaStore nyStore = new NYPizzaStore();
            final PizzaStore chicagoStore = new ChicagoPizzaStore();
            Pizza pizza = nyStore.orderPizza("cheese");
            System.out.println("Ethan ordered a " + pizza.getName() + '\n');
            pizza = chicagoStore.orderPizza("cheese");
            System.out.println("Joe ordered a " + pizza.getName() + '\n');
        }
}
