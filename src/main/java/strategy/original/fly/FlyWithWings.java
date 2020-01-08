package strategy.original.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("펄펄 난다~");
    }
}
