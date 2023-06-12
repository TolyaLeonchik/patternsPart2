package adapter.interfaceMethod;

public class Main {
    public static void main(String[] args) {
        Starter starter = new StarterAdapter();
        starter.startMachine();
    }
}
