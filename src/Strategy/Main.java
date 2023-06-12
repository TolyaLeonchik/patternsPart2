package Strategy;

public class Main {
    public static void main(String[] args) {
        Man man = new Man();

        man.setActivities(new Sleep());
        man.doing();

        man.setActivities(new WokeUp());
        man.doing();

        man.setActivities(new Eat());
        man.doing();

        man.setActivities(new Job());
        man.doing();

        man.setActivities(new Sleep());
        man.doing();
    }
}
