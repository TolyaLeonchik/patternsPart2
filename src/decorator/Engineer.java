package decorator;

public class Engineer implements EngineerLogic{
    @Override
    public void screwSomething() {
        System.out.println("Screwing");
    }
}
