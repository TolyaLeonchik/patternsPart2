package Strategy;

public class Man {
    DayActivities activities;

    public void setActivities(DayActivities activities) {
        this.activities = activities;
    }
    public void doing() {
        activities.action();
    }
}
