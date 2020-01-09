package observer;

public class Advertise {

    private String date;
    private String content;

    public Advertise(String date){
        this.date = date;
        this.content = date + "자 광고";
    }

    public void read(){
        System.out.println(content);
    }
}
