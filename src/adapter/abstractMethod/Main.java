package adapter.abstractMethod;

public class Main {
    public static void main(String[] args) {
        ElectricVehicle electricVehicle = new ElectricVehicle();
        MechanicalVehicle mechanicalVehicle = new MechanicalVehicle();
        Starter starter = new StartingAdapter();

        electricVehicle.startMachine();
        mechanicalVehicle.startMachine();
        starter.startMachine();
    }
}
