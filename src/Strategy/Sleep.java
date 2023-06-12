package Strategy;

public class Sleep implements DayActivities{
    @Override
    public void action() {
        System.out.println("Sleeping...");
    }
}
