package Chain;

public class SmallBalanceNotification extends NotificationOfDebts{
    public SmallBalanceNotification(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("Small balance: " + message);
    }
}
