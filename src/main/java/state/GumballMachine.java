package state;

public class GumballMachine {

    State noCoinState;
    State hasCoinState;
    State soldState;
    State soldOutState;
    State winnerState;

    private State state;
    private int count = 0;

    public GumballMachine(int count){
        this.count = count;
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        state = noCoinState;
    }

    public void insertCoin(){
        state.insertCoin();
    }

    public void ejectCoin(){
        state.ejectCoin();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void releaseBall() {
        System.out.println("알맹이가 나오는 중입니다");
        if(count != 0){
            count--;
        }
        System.out.println("알맹이가 나왔습니다");
    }
}
