package Observer;

import java.util.ArrayList;
import java.util.List;

public class SteamSite implements Steam{
    List<String> games = new ArrayList<>();
    List<Observer> nameAccount = new ArrayList<>();
    public void addGame(String gameName) {
        this.games.add(gameName);
        notification();
    }
    public void removeGame(String gameName) {
        this.games.remove(gameName);
        notification();
    }
    @Override
    public void addObserver(Observer observer) {
        this.nameAccount.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.nameAccount.remove(observer);
    }

    @Override
    public void notification() {
        for (Observer observer: nameAccount) {
            observer.steamEventSale(games);
        }
    }
}
