package templatemethod;

public class Client {

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepare();
        System.out.println("=============");
        Coffee coffee = new Coffee();
        coffee.prepare();
        System.out.println("=============");
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        coffeeWithHook.prepare("vanilla syrup");
        System.out.println("=============");
        CheapestCoffee cheapestCoffee = new CheapestCoffee();
        cheapestCoffee.prepare("aaa");

    }
}
