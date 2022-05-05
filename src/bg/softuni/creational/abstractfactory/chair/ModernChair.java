package bg.softuni.creational.abstractfactory.chair;

public class ModernChair implements Chair {

    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("Sit on Modern chair.");
    }
}
