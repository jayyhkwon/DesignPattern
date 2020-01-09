package observer;

public class Example {

    public static void main(String[] args) {
        NewsPaperCompanyA companyA = new NewsPaperCompanyA();
        NewsPaperCompanyB companyB = new NewsPaperCompanyB();

        Subscriber subscriber = new Subscriber();

        subscriber.subscribe(companyA);
        subscriber.subscribe(companyB);

        companyA.publish("2020년 1월 9일");
        companyB.publish("2020년 1월 9일");

        subscriber.readNews();

    }
}
