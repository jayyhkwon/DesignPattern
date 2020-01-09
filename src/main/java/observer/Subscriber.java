package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer {

    private List<News> todayNews;
    private Observable paperBoy;

    public Subscriber() {
        todayNews = new ArrayList<>();
    }

    public void subscribe(NewsPaperCompany newsPaperCompany) {
        paperBoy = newsPaperCompany.assignPaperboy();
        paperBoy.addObserver(this);
    }

    public void readNews() {
        if (isNewsDelivered()) {
            todayNews.forEach(news -> news.read());
            return;
        }
        System.out.println("뉴스가 도착하지 않았습니다");
    }

    private boolean isNewsDelivered() {
        return todayNews.size() != 0;
    }


    @Override
    public void update(Observable o, Object arg) {
        todayNews.add((News) arg);
    }
}
