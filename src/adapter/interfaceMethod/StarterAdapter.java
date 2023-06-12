package adapter.interfaceMethod;

public class StarterAdapter extends Motorbike implements Starter{
    @Override
    public void startMachine() {
        startEngineMotorbike();
    }
}
