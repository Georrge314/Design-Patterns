package bg.softuni.creational.factorymethod.factory;

import bg.softuni.creational.factorymethod.Ship;
import bg.softuni.creational.factorymethod.Transport;

public class SeaLogistics implements Logistics{

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
