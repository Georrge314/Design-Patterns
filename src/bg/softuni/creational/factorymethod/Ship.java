package bg.softuni.creational.factorymethod;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivery by sea in a container.");
    }
}
