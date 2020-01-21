package state;

public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("매진입니다.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("매진입니다");
    }

    @Override
    public void turnCrank() {
        System.out.println("매진입니다");
    }

    @Override
    public void dispense() {
        System.out.println("매진입니다");
    }
}
