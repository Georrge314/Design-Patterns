package bg.softuni.creational.factorymethod.factory;

import bg.softuni.creational.factorymethod.Transport;
import bg.softuni.creational.factorymethod.Truck;

public class RoadLogistics implements Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
