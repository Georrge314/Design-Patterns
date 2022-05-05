package bg.softuni.creational.abstractfactory.coffeetable;

public class ModernCoffeeTable implements CoffeeTable{
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void placeAnObject(String objectName) {
        System.out.println(objectName + " is placed on the Modern coffee table.");
    }
}
