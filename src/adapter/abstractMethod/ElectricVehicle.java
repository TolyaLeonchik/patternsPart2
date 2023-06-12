package adapter.abstractMethod;

public class ElectricVehicle extends Starter{
    @Override
    void startMachine() {
        System.out.println("logic for Electric Vehicle");
    }
}
