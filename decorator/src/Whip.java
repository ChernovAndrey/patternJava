/**
 * Created by andrey on 10.08.17.
 */

public class Whip  extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost(){
        return 0.1 + beverage.cost();
    }
}
