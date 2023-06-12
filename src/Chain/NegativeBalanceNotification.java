package Chain;

public class NegativeBalanceNotification extends NotificationOfDebts{
    public NegativeBalanceNotification(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("Negative balance: " + message);
    }
}
