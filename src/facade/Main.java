package facade;

public class Main {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();

        carFacade.carControl();

        carFacade.driver.inCar();
        carFacade.engine.start();
        carFacade.carDrive.drive();
        carFacade.engine.stop();
        carFacade.driver.outCar();
    }
}
