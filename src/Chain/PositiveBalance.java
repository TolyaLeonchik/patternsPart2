package Chain;

public class PositiveBalance extends NotificationOfDebts{
    public PositiveBalance(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("Balance: " + message);
    }
}
