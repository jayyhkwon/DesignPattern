package templatemethod;

/**
 * This coffee can't be added any condiment.
 */
public class CheapestCoffee extends BeverageWithHook {

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments(String condiments) {
    }

    // override hook method
    @Override
    protected boolean customerWantsCondiments(String condiments) {
        return false;
    }
}
