package templatemethod;

public  abstract class Beverage {

    final void prepare(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water...");
    }

    abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring water in Cup...");
    }

    abstract void addCondiments();

}
