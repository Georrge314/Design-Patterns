package bg.softuni.creational.abstractfactory.chair;

public class ArtDecoChair implements Chair{
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("Sit on Art Deco chair.");
    }
}
