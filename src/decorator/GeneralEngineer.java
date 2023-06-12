package decorator;

public class GeneralEngineer extends Decorator{
    public GeneralEngineer(EngineerLogic engineerLogic) {
        super(engineerLogic);
    }

    @Override
    public void screwSomething() {
        super.screwSomething();
        System.out.println("Keep an eye on engineers");
    }
}
