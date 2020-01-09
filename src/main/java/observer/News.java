package observer;

public abstract class News {

    public String date;
    public String content;
    public Advertise advertise;

    public void read(){
        System.out.println(content);
        if(hasAdvertise())
            advertise.read();
    }

    public void removeAdvertise(){
        if(advertise != null)
            this.advertise = null;
    }

    public boolean hasAdvertise(){
        return advertise != null;
    }

}
