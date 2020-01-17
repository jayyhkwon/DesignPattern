package templatemethod;

public class TeaWithHook extends BeverageWithHook{

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments(String condiments) {
        System.out.println("Adding " + condiments);
    }
}
