package decorator;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new AssistantDirector(new GeneralEngineer(new Engineer())));

        director.screwSomething();
    }
}
