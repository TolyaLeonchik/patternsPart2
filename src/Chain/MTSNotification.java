package Chain;

public class MTSNotification {
    public static void main(String[] args) {
        NotificationOfDebts notifyBalance = new PositiveBalance(Priorities.positiveBalance);
        NotificationOfDebts notifyWarning = new SmallBalanceNotification(Priorities.smallBalance);
        NotificationOfDebts notifyBlockedAccount = new NegativeBalanceNotification(Priorities.negativeBalance);

        notifyBalance.setNotify(notifyWarning);
        notifyWarning.setNotify(notifyBlockedAccount);

        notifyBalance.notifyUser("Balance is positive", Priorities.positiveBalance);
        notifyBalance.notifyUser("Balance is small", Priorities.smallBalance);
        notifyBalance.notifyUser("Balance is negative. Your bill is blocked!!!", Priorities.negativeBalance);
    }
}
