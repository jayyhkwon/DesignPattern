## 옵저버 패턴



> **개념**

- Observser 객체들의 관심 대상인 **Subject객체**
- Subject의 상태의 변화를 알고 싶은 **Observer객체**

- 신문사에 신문을 구독신청하는 상황을 생각해보자
  - 신문을 구독신청하게 되면 신문사가 매일 아침 신문을 나에게 배달해준다
  - 신문사가 Subject, 구독자가 Observer가 된다. Subject는 Observer가 누구인지 구체적으로 알 필요가 없다. **그저 모든 구독자에게 신문을 가져다주기만 하면 된다.** 이러한 방식을 **Push 방식**이라고 한다 ( Subject가 상태 값을 Observer에게 직접 전달하는 방식 )
  - Push 방식으로 신문을 받게 되면 내가 원치않는 광고지가 딸려올 수 있다. 그래서 신문사에 전화해서 광고지를 빼달라고 했더니 구독자 하나하나를 신경 써줄 수 없으니 신문을 받고 광고지를 버리라고 한다. 힘 없는 구독자 중 1명인 나는 어쩔 수 없이 신문을 받아 광고지를 버리고 신문을 읽게 되었다. 불편하다.
  - 신문사에서 구독료를 추가로 지불하면 광고를 제외하고 신문만 제공해 주는 서비스를 출시하였다. 나는 신문을 펼칠 때마다 광고를 제거하는 것이 귀찮아 광고제외 서비스를 신청하였다. 이제 배달원이 광고를 제외하고 배달해줘서 광고를 제거하는 귀찮음이 사라졌다. 편리하다. Observer가 Subject가 전달한 데이터 중에 원하는 것만 취하는 전략을 **Pull 방식**이라고 한다.

![옵저버 패턴](https://i0.wp.com/friday.fun25.co.kr/blog/wp-content/uploads/2017/03/observer.png?resize=353%2C276)







>  **Push 방식 vs Pull 방식**

- Push 방식
  - 장점
    - Observer와 Subject 간의 느슨한 결합을 유지한다 (인터페이스간 의존관계)
  - 단점
    - 유연하지 못하다. Observer에 필요한 데이터 뿐만 아니라 불필요한 데이터까지 모두 Subject에게서 전달된다.
- Pull 방식
  - 장점
    - 유연하다. 원하는 데이터만 선별해서 추출할 수 있다
  - 단점
    - Observer와 Subject 간의 강한 결합을 유지한다. (구상 클래스에 의존한다)
- **서로 trade-off 관계이므로 데이터 수가 적거나 Observer가 적은 경우 Push 방식을 사용하고 반대의 경우 Pull 방식이 권장된다.**






