package bg.softuni.creational.factorymethod;

public class Plain implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivery by air in a container.");
    }
}
