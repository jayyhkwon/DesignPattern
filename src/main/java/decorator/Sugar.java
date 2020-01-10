package decorator;

public class Sugar implements Topping {

    private Beverage beverage;
    private String description = " ,설탕";
    private long cost = 300L;

    public Sugar(Beverage beverage){
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
