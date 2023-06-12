package Observer;

public interface Steam {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notification();
}
