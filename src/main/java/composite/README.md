## Composite Pattern



> 컴포지트 패턴

- 컴포지트 패턴을 이용하면 객체들을 트리 구조로 구성하여 부분과 전체를 나타내는 계층구조로 만들 수 있다
- 클라이언트에서 개별 객체(leaf)와 다른 객체들로 구성된 복합 객체(composite)를 똑같은 방법으로 다룰 수 있다



> 클래스 다이어그램

![Composite UML class diagram (fixed).svg](https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Composite_UML_class_diagram_%28fixed%29.svg/480px-Composite_UML_class_diagram_%28fixed%29.svg.png)



> **소스코드 구성**

> **1. leaf와 composite가 같은 인터페이스를 사용하는 경우**

<br>
<img src="https://github.com/jayyhkwon/DesignPattern/blob/master/src/main/java/composite/composite1.png"/>
<br>

- 장점
  - **투명성이 높다** -> leaf와 composite를 같은 방식으로 처리할 수 있다
- 단점
  - 안정성이 떨어진다 -> 클라이언트가 부적절한 작업을 요청할 수 있다
- `git checkout feature/composite1`

<br>

<br>

> **2. leaf와 composite가 다른 인터페이스를 사용하는 경우**

<br>
<img src="https://github.com/jayyhkwon/DesignPattern/blob/master/src/main/java/composite/composite2.png"/>
<br>

- 장점
  - **안정성이 높다** -> 인터페이스를 분리하여 불필요한 요청을 막는다
- 단점
  - 투명성이 떨어진다 -> 조건문이나 instanceof 연산자로 분기처리 해야한다
- `git checkout feature/composite2`