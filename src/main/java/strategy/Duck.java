package strategy;

public abstract class Duck {

    public static Duck getDuck(DuckType type) {
        switch (type) {
            case RUBBER:
                return new RubberDuck();
            case REDHEAD:
                return new RedHeadDuck();
            case MALLARD:
                return new MallardDuck();
            case DECOY:
                return new DecoyDuck();
            default:
                return null;
        }
    }

    protected abstract void display();

    public void swim(){
        System.out.println("어푸어푸");
    };



}
