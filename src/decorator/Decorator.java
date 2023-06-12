package decorator;

public class Decorator implements EngineerLogic{
    public EngineerLogic engineerLogic;

    public Decorator(EngineerLogic engineerLogic) {
        this.engineerLogic = engineerLogic;
    }

    @Override
    public void screwSomething() {
        engineerLogic.screwSomething();
    }
}
