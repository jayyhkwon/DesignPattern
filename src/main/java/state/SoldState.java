package state;


public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("알맹이가 나오는 중입니다. 잠시만 기다려주세요");
    }

    @Override
    public void ejectCoin() {
        System.out.println("남은 코인이 없습니다");
    }

    @Override
    public void turnCrank() {
        System.out.println("남은 코인이 없습니다");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoCoinState());
        } else {
            System.out.println("매진입니다");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
