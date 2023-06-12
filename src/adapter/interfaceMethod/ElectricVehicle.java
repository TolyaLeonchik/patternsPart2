package adapter.interfaceMethod;

public class ElectricVehicle implements Starter {

    @Override
    public void startMachine() {
        System.out.println("logic for Electric Vehicle");
    }
}
