package bg.softuni.creational.abstractfactory.sofa;

public class ModernSofa implements Sofa{
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        System.out.println("Sit on Modern sofa.");
    }
}
