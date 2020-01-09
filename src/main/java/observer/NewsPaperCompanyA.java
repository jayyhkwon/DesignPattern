package observer;

import java.util.Observable;

/**
 * push 방식 Observable
 */
public class NewsPaperCompanyA extends Observable implements NewsPaperCompany {

    private News todayNews;
    private PaperBoy paperBoy;

    public NewsPaperCompanyA(){
        this.paperBoy = new PaperBoy(this);
    }

    public void publish(String date){
        this.todayNews = new NewsA(date);
        setChanged();
        notifyObservers(todayNews);
    }

    public News getTodayNews() {
        return todayNews;
    }

    @Override
    public Observable assignPaperboy() {
        return paperBoy;
    }
}
