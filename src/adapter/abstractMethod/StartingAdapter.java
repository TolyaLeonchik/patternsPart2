package adapter.abstractMethod;

public class StartingAdapter extends Starter{
    Motorbike motorbike = new Motorbike();

    @Override
    void startMachine() {
        motorbike.startEngineMotorbike();
    }
}
