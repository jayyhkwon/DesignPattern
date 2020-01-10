package decorator;

public class CafeLatte implements Beverage {

    private String description = "카페라떼";
    private long cost = 4600L;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public long cost() {
        return cost;
    }
}
