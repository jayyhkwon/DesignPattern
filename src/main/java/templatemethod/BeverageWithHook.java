package templatemethod;

public abstract class BeverageWithHook {

    final void prepare(String condiments){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments(condiments))
            addCondiments(condiments);
    }

    private void boilWater() {
        System.out.println("Boiling water...");
    }

    abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring water in Cup...");
    }

    abstract void addCondiments(String condiments);

    // hook method
    protected boolean customerWantsCondiments(String condiments) {
        if(condiments != null && !condiments.equals(""))
            return true;

        return false;
    }

}
