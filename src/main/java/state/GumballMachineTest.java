package state;

public class GumballMachineTest {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(3);

        System.out.println("--- 동전 넣고 손잡이 돌린다 ---");
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();

        System.out.println("--- 손잡이만 돌린다 ---");
        gumballMachine.turnCrank();

        System.out.println("--- 반환 버튼을 누른다 ---");
        gumballMachine.ejectCoin();

        System.out.println("--- 동전 넣고 손잡이 돌린다 ---");
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();

        System.out.println("--- 동전 넣고 손잡이 돌린다 ---");
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();

        System.out.println("--- 매진 후 동전을 넣는다 ---");
        gumballMachine.insertCoin();

        // 만약 1/10 확률로 알맹이를 하나 더 주는 요구사항이 추가된다면?
        // GumballMachine 클래스에 추가될 내용을 생각해보면
        // 1. WINNER 프로퍼티 추가
        // 2. insertCoin(), ejectQuarter(), turnCrank(), dispense() 메서드 내 switch문 추가
        // -> 기존코드 변경이 발생 -> OCP 위반! -> 변경되는 부분 캡슐화하자!
        // 변경되는 부분 : 상태마다 메서드에 다르게 동작한다
        // -> 상태를 클래스로 만들어 캡슐화하자!
    }
}
