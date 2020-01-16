## Adapter Pattern



> **어댑터 패턴**

- 한 클래스의 인터페이스를 다른 인터페이스로 변환하고자 할 때 사용하는 패턴
- 어댑터를 이용하면 인터페이스 호환성 문제 때문에 같이 쓸 수 없는 클래스들을 연결해서 사용할 수 있다
- 자바 API 중 Arrays.asList() 메서드는 어댑터 패턴의 적용예제라 할 수 있


![img](https://t1.daumcdn.net/cfile/tistory/24231F4C575EACA210)

<br>
<br>



> **역활이 수행하는 작업**

- Target

  - 클라이언트가 기존에 가지고 있는 인터페이스

- Adapter

  - Target 인터페이스와 Adaptee 인터페이스를 연결해주는 어댑터
  - Target 인터페이스를 구현하는 클래스
  - Adapter **has a** Adaptee

- Adaptee

  - 신규로 사용하고자 하는 인터페이스
  - Adapter 클래스 내에서 실제 동작을 수행한다

> **Decorator Pattern vs Adapter Pattern**
- 데코레이터 패턴
    - 객체의 행동이나 책임을 확장하는 역활
    - 인터페이스 변환 x
- 어댑터 패턴
    - 객체의 인터페이스를 변환
 