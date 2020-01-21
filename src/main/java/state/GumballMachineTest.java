package state;

public class GumballMachineTest {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

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

        System.out.println("--- 동전 넣고 손잡이 돌린다 ---");
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();

        System.out.println("--- 매진 후 동전을 넣는다 ---");
        gumballMachine.insertCoin();
    }
}
