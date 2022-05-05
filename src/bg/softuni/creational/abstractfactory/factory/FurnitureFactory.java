package bg.softuni.creational.abstractfactory.factory;

import bg.softuni.creational.abstractfactory.chair.Chair;
import bg.softuni.creational.abstractfactory.coffeetable.CoffeeTable;
import bg.softuni.creational.abstractfactory.sofa.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
