package decorator;

public class Mocha implements Topping {

    private Beverage beverage;
    private String description = " ,모카";
    private long cost = 500L;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + description ;
    }

    @Override
    public long cost() {
        return beverage.cost() + cost;
    }
}
