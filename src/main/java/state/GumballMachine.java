package state;

public class GumballMachine {
    private static final int SOLD_OUT = 0;
    private static final int NO_COIN = 1; // 코인 투입 전
    private static final int HAS_COIN = 2; // 코인 투입
    private static final int SOLD = 3; // 판매

    private int state = SOLD_OUT;
    private int count = 0;

    public GumballMachine(int count){
        this.count = count;
        if(count > 0){
            this.state = NO_COIN;
        }
    }

    public void insertCoin(){
        switch (state){
            case NO_COIN:
                state = HAS_COIN;
                System.out.println("코인을 투입하셨습니다");
                break;
            case HAS_COIN:
                System.out.println("코인이 이미 존재합니다");
                break;
            case SOLD_OUT:
                System.out.println("매진입니다. 관리자에게 문의하세요");
                break;
            case SOLD:
                System.out.println("알맹이가 나오는 중입니다. 잠시만 기다려주세요");
        }
    }

    public void ejectCoin(){
        switch (state){
            case NO_COIN:
                System.out.println("반환할 코인이 없습니다");
                break;
            case HAS_COIN:
                System.out.println("코인이 반환됩니다");
                state = NO_COIN;
                break;
            case SOLD:
                System.out.println("코인이 없습니다");
                break;
            case SOLD_OUT:
                System.out.println("반환할 코인이 없습니다");
                break;
        }
    }

    public void turnCrank(){
        switch (state){
            case NO_COIN:
                System.out.println("코인을 먼저 넣어주세요");
                break;
            case HAS_COIN:
                System.out.println("손잡이를 돌리셨습니다");
                state = SOLD;
                dispense();
                break;
            case SOLD_OUT:
                System.out.println("매진입니다. 관리자에게 문의하세요");
                break;
            case SOLD:
                System.out.println("손잡이는 한번만 돌려주세요");
                break;
        }
    }

    private void dispense() {
        switch (state){
            case NO_COIN:
                System.out.println("코인을 넣어주세요");
                break;
            case HAS_COIN:
                System.out.println("손잡이를 먼저 돌려주세요");
                break;
            case SOLD:
                System.out.println("알맹이가 나가는 중입니다");
                System.out.println("알맹이를 얻으셨습니다");
                count--;
                if(count == 0){
                    System.out.println("알맹이가 더 이상 없습니다.");
                    state = SOLD_OUT;
                } else {
                    state = NO_COIN;
                }
        }
    }
}
