package templatemethod;

public class CoffeeWithHook extends BeverageWithHook {

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments(String condiments) {
        System.out.println("Adding " + condiments);
    }

}
