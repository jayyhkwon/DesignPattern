package decorator;

public class DecoratorTest {

    public static void main(String[] args) {

        Beverage caffelatte = new CafeLatte();
        caffelatte = new Mocha(caffelatte);
        caffelatte = new Milk(caffelatte); //모카와 우유를 첨가한 카레라떼

        Beverage americano = new Sugar(new Milk(new Americano())); // 설탕과 우유를 첨가한 아메리카노

        System.out.println(caffelatte.getDescription());
        System.out.println(caffelatte.cost());
        System.out.println(americano.getDescription());
        System.out.println(americano.cost());

    }
}
