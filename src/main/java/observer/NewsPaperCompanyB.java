package observer;

import java.util.Observable;

/**
 * pull 방식 Observable
 */
public class NewsPaperCompanyB extends Observable implements NewsPaperCompany{

    private News todayNews;
    private Observable paperBoy;

    public NewsPaperCompanyB(){
        this.paperBoy = new PaperBoy(this);
    }

    public void publish(String date){
        this.todayNews = new NewsB(date);
        setChanged();
        notifyObservers();
    }

    public News getTodayNews() {
        return todayNews;
    }

    @Override
    public Observable assignPaperboy() {
        return paperBoy;
    }
}
