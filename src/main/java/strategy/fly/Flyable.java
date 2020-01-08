package strategy.fly;

public interface Flyable {

    default void fly(){
        System.out.println("난다");
    }
}
