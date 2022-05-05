package bg.softuni.creational.factorymethod.factory;

import bg.softuni.creational.factorymethod.Plain;
import bg.softuni.creational.factorymethod.Transport;

public class AirLogistics implements Logistics{
    @Override
    public Transport createTransport() {
        return new Plain();
    }
}
