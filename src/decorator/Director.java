package decorator;

public class Director extends Decorator{
    public Director(EngineerLogic engineerLogic) {
        super(engineerLogic);
    }

    @Override
    public void screwSomething() {
        super.screwSomething();
        System.out.println("Can control everybody");
    }
}
