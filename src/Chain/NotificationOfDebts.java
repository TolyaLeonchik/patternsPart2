package Chain;

public abstract class NotificationOfDebts {
    private int levelOfDebt;
    private NotificationOfDebts notify;
    public NotificationOfDebts(int level) {
        this.levelOfDebt = level;
    }

    public void setNotify(NotificationOfDebts notify) {
        this.notify = notify;
    }
    public void notifyUser(String message, int level) {
        if (level >= levelOfDebt) {
            write(message);
        }
        if (notify != null) {
            notify.notifyUser(message, level);
        }
    }
    public abstract void write(String message);
}
