package state;

public class NoCoinState implements State {

    private GumballMachine gumballMachine;

    public NoCoinState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("코인을 넣었습니다");
        gumballMachine.setState(gumballMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("코인을 넣어주세요");
    }

    @Override
    public void turnCrank() {
        System.out.println("코인이 없습니다");
    }

    @Override
    public void dispense() {
        System.out.println("코인을 넣어주세요");
    }
}
