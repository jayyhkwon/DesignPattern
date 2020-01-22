package proxy;

public class Broker implements PersonInforation {

    private String name;
    private String Job;
    private String address;
    private String number;
    private String introduce;

    private PersonInforation client;

    public Broker(String name, String job, String address, String number, String introduce, PersonInforation client){
        this.name = name;
        this.Job = job;
        this.address = address;
        this.number = number;
        this.introduce = introduce;
        this.client = client;
    }

    @Override
    public String getName() {
        return client.getName();
    }

    @Override
    public String getJob() {
        return client.getJob();
    }

    @Override
    public String getIntroduce(){
        return client.getIntroduce();
    }

    @Override
    public String getAddress() {
        return "비밀 정보입니다";
    }

    @Override
    public String getNumber() {
        return "비밀 정보입니다";
    }
}
