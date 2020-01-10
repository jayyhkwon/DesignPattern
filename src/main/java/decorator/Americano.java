package decorator;

public class Americano implements Beverage{

    private String description = "아메리카노";
    private long cost = 4100L;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public long cost() {
        return cost;
    }

}
