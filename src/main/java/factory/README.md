## 팩토리 패턴



> **팩토리 메서드 패턴**

- **상속**을 활용한다
- 객체 생성이 서브 클래스에 위임된다
- 서브클래스에서 팩토리 메서드를 구현하여 객체를 생성한다
- **템플릿 메서드 패턴의 일부로 사용될 수 있다**

<br>



![structure](https://johngrib.github.io/post-img/factory-method-pattern/structure.gif)

<br>

>**추상 팩토리 패턴**

- **객체 구성**을 활용한다
- 구상 클래스에 의존하지 않고 서로 관련된 객체들로 이루어진 제품군을 만들기 위한 용도로 사용한다
- 추상 팩토리 패턴을 구현할 때 팩토리 메서드를 사용할 수도 있다

<br>

![structure](https://johngrib.github.io/post-img/abstract-factory-pattern/structure.gif)

<br>

> **공통점**

- **객체 생성을 캡슐화 한다 -> 클라이언트는 생성된 객체의 정확한 타입을 알 필요가 없다. 추상 타입에 의존한다**

<br>

> **차이점**

- 팩토리 메서드 패턴은 **하나의 제품**을 생성하는 책임이 있는 반면 추상 팩토리 패턴은 **제품군**을 생성하는 책임이 있으므로 추상 팩토리 패턴이 변화에 따른 변동사항이 크다
  - 해결 방안
    - 추상 팩토리 인터페이스를 make(), create() 메서드로 변경하여 필요한 제품군을 한 번에 생성할 수도 있다
    - 추상 팩토리 인터페이스에 추가된 제품을 default 메서드로 추가한다

<br>

<br>

ref. <a href="https://johngrib.github.io/wiki/factory-method-pattern/">블로그</a><br>

ref. <a href="https://softwareengineering.stackexchange.com/questions/340099/factory-method-is-a-specialization-of-template-method-how">팩토리 메서드 패턴 vs 템플릿 메서드 패턴</a>