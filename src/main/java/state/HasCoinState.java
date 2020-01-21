package state;

import java.util.Random;

public class HasCoinState implements State {

    private Random randomWinner = new Random(System.currentTimeMillis());
    private GumballMachine gumballMachine;

    public HasCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("코인이 이미 존재합니다");
    }

    @Override
    public void ejectCoin() {
        System.out.println("코인을 반환합니다");
        System.out.println("코인이 반환되었습니다");
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이를 돌리셨습니다");
        int winner = randomWinner.nextInt(10);
        if(winner == 0 && (gumballMachine.getCount() > 1)){
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("알맹이가 나갈 수 없습니다");
    }
}
