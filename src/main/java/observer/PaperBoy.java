package observer;

import java.util.Observable;
import java.util.Observer;

public class PaperBoy extends Observable implements Observer {

    private News news;
    private Observable newsCompany;

    public PaperBoy(Observable observable){
        this.newsCompany = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        // pull 방식
        if (isFromNewsPaperCompanyB(o)) {
            update(o);
            deliver();
            return;
        }
        // push 방식
        news = ((News) arg);
        deliver();
    }

    public void update(Observable o) {
        NewsPaperCompanyB companyB = (NewsPaperCompanyB) o;
        news = companyB.getTodayNews();
        removeAdvertise();
    }

    private boolean isFromNewsPaperCompanyB(Observable o) {
        return o instanceof NewsPaperCompanyB;
    }

    public void removeAdvertise(){
        news.removeAdvertise();
    }

    public void deliver(){
        setChanged();
        notifyObservers(news);
    }
}
