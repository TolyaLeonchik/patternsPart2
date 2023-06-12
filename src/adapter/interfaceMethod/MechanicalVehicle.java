package adapter.interfaceMethod;

public class MechanicalVehicle implements Starter {
    @Override
    public void startMachine() {
        System.out.println("logic for Mechanical Vehicle");
    }
}
