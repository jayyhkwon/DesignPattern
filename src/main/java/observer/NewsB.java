package observer;

public class NewsB extends News{

    public NewsB(String date){
        this.date = date;
        this.advertise = new Advertise(date);
        this.content = date + "자 뉴스B";
    }



}
