## State Pattern



> **스테이트 패턴**

- 객체의 내부 상태가 바뀜에 따라서 객체의 행동을 바꿀 수 있다

<br>

<br>

>  **Strategy 패턴과 차이점**

- 런타임에 클라이언트가 사용할 알고리즘을 컨텍스트 객체에 건네주는 Strategy 패턴과 달리<br>

  스테이트 패턴은 컨텍스트 객체 내부 상태에 따라 상태 객체가 바뀐다.

- 유연성을 극대화 하기 위한 용도로 Strategy 패턴을 사용하고 수 많은 조건문 대신에 사용하는 패턴이 State 패턴이다

<br>

<br>



> **클래스 다이어그램**

![img](https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/State_Design_Pattern_UML_Class_Diagram.svg/400px-State_Design_Pattern_UML_Class_Diagram.svg.png)

<br><br>

> **소스코드 구성**

> 1. **조건문으로 작성**

- `git checkout feature/state1`

<br>

> 2. **State 객체로 캡슐화**

- `git checkout feature/state2`