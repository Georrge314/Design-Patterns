package bg.softuni.creational.abstractfactory.coffeetable;

public class VictorianCoffeeTable implements CoffeeTable{
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void placeAnObject(String objectName) {
        System.out.println(objectName + " is placed on the Victorian coffee table.");
    }
}
