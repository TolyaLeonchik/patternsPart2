package decorator;

public class AssistantDirector extends Decorator{
    public AssistantDirector(EngineerLogic engineerLogic) {
        super(engineerLogic);
    }

    @Override
    public void screwSomething() {
        super.screwSomething();
        System.out.println("Can make quests");
    }
}
