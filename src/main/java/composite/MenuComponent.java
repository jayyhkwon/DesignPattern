package composite;
/**
 * 모든 구성요소에서는 MenuComponent 인터페이스를 구현해야 한다.
 * 하지만 leaf와 composite는 각각 역활이 다르기 때문에 모든 메서드에 대해서
 * 각 역활에 알맞는 기본 메서드를 구현하는 것은 불가능하다.
 * 그래서 자기 역활에 맞지않는 상황을 기준으로 예외를 던지는 코드를 기본 구현으로 제공한다.
 *
 */

public abstract class MenuComponent {

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }
}
