package state;

public class WinnerState implements State {

    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("나올 수 없는 케이스");
    }

    @Override
    public void ejectCoin() {
        System.out.println("나올 수 없는 케이스");
    }

    @Override
    public void turnCrank() {
        System.out.println("나올 수 없는 케이스");
    }

    @Override
    public void dispense() {
        System.out.println("축하합니다. 1+1에 당첨되셨습니다");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else{
            gumballMachine.releaseBall();
            if(gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoCoinState());
            } else{
                System.out.println("더 이상 알맹이가 없습니다");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
