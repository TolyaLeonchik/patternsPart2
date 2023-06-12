package facade;

public class CarFacade {
    Driver driver = new Driver();
    Engine engine = new Engine();
    CarDrive carDrive = new CarDrive();

    public void carControl() {
        driver.inCar();
        engine.start();
        carDrive.drive();
        engine.stop();
        driver.outCar();
    }
}
