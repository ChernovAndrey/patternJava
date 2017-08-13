/**
 * Created by andrey on 10.08.17.
 */
public abstract class Beverage {

    public String description ="Unknown Beverage";

    public String getDescription(){return  description;}

    public abstract double cost();
}
