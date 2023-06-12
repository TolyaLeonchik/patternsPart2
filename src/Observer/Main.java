package Observer;

public class Main {
    public static void main(String[] args) {
        SteamSite magazine = new SteamSite();

        magazine.addGame("GTA V");
        magazine.addGame("Red Dead Redemption II");

        Observer firstAccount = new Subscriber("Petya");
        Observer secondAccount = new Subscriber("Stas2017Pro");

        magazine.addObserver(firstAccount);
        magazine.addObserver(secondAccount);

        magazine.addGame("Portal 2");
        magazine.removeGame("GTA V");
    }
}
