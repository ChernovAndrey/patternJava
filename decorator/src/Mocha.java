/**
 * Created by andrey on 10.08.17.
 */
public class Mocha  extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost(){
        return 0.2 + beverage.cost();
    }
}
