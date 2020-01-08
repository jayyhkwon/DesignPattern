package strategy;

import strategy.fly.Flyable;
import strategy.quack.Quackable;

public class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    protected void display() {

    }

    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }

    @Override
    public void fly() {
        System.out.println("팔랑팔랑");
    }
}
