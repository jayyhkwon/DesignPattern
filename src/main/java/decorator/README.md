## Decorator Pattern



> **데코레이터 패턴**

-  **객체의 구성**을 통해 기능을 동적으로 유연하게 확장할 수 있게 해주는 패턴

  - 객체의 구성이란 인스턴스 변수로 다른 객체를 저장하는 방식을 말한다
  - 상속을 통해 확장할 경우 필요없는 메서드들까지 상속 받아야 한다

- **기존의 코드를 건드리지 않고 새로운 코드를 만들어서 새로운 기능을 추가할 수 있다**(OCP 원칙)

- **Decorator가 Component를 상속 또는 구현하는 목적은 타입을 맞추려는 거지, 메서드를 상속받으려는 목적이 아니다**

  



![decorator 패턴에 대한 이미지 검색결과](https://t1.daumcdn.net/cfile/tistory/2545B4385733308E39)



<br>

<br>

<img src="https://github.com/jayyhkwon/DesignPattern/blob/master/src/main/java/decorator/DecoratorPattern.png"/>



```java
package decorator;

public class DecoratorTest {
    
    public static void main(String[] args) {

	      //모카와 우유를 첨가한 카레라떼
        Beverage caffelatte = new CafeLatte();
        caffelatte = new Mocha(caffelatte);
        caffelatte = new Milk(caffelatte);
				
      	// 설탕과 우유를 첨가한 아메리카노
        Beverage americano = new Sugar(new Milk(new Americano())); 

        System.out.println(caffelatte.getDescription());
        System.out.println(caffelatte.cost());
        System.out.println(americano.getDescription());
        System.out.println(americano.cost());

    }
}

```



- 한 객체를 여러 개의 데코레이터로 랩핑할 수 있다
- 데코레이터는 자신이 장식하고 있는 객체에게 어떤 행동을 위임하는 것 이외에 원하는 추가적인 작업을 수행할 수 있다



> **주의점**

- 구상 구성요소의 타입을 알아내서 그 결과를 바탕으로 어떤 작업을 처리하는 코드에 데코레이터 패턴을 적용하면 코드가 제대로 동작하지 않는다. 이러한 경우 데코레이터 패턴을 사용하는 것에 대해 다시 한 번 생각해볼 필요가 있다

