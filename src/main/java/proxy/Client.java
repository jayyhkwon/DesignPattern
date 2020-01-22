package proxy;

public class Client {

    public static void main(String[] args) {
        PersonInforation candidate = new Candidate("jay","developer","seoul",
                                                "01012345678", "안녕하세요. jay 입니다");
        PersonInforation broker = new Broker("mike","broker","seoul",
                                                "021234567", "안녕하세요. 결혼정보업체 입니다", candidate);

        // client는 소개팅 대상의 정보를 직접 얻을 수 없다.
        // broker를 통해서만 소개팅 대상의 정보를 얻을 수 있다
        // 후보자의 개인정보 중 주소와 연락처는 고객에게 공개되선 안되는 정보이다.
        System.out.println(broker.getName());
        System.out.println(broker.getJob());
        System.out.println(broker.getIntroduce());
        // 접근할 수 없는 정보
        System.out.println(broker.getAddress());
        System.out.println(broker.getNumber());
    }
}
