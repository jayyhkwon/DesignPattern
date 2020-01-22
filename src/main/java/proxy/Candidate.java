package proxy;

public class Candidate implements PersonInforation {

    private String name;
    private String job;
    private String address;
    private String number;
    private String introduce;

    public Candidate(String name, String job, String address, String number, String introduce){
        this.name = name;
        this.job = job;
        this.address = address;
        this.number = number;
        this.introduce = introduce;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getJob() {
        return job;
    }

    @Override
    public String getIntroduce() {
        return introduce;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getNumber() {
        return number;
    }
}
