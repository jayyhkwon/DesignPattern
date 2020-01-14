## Singleton Pattern

> **개념** 
- 스레드풀, 캐시, 로그기록용 객체 등 인스턴스를 두 개이상 만들 필요가 없는 객체에 사용하는 패턴
<br>
<br>

> **구현방법**
- Early
    - 클래스가 로딩되는 시점에 싱글톤 객체를 생성한다
- Lazy
    - getInstance()가 호출되는 시점에 싱글톤 객체를 생성한다
    - Lazy init + thread-safe한 이유로 holder 패턴이 가장 많이 상요된다.