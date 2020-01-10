package decorator;

public class Milk implements Topping {

    private Beverage beverage;
    private String description = " ,우유";
    private long cost = 500L;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + description;
    }

    @Override
    public long cost() {
        return beverage.cost() + cost;
    }
}
