package bg.softuni.creational.abstractfactory.factory;

import bg.softuni.creational.abstractfactory.chair.ArtDecoChair;
import bg.softuni.creational.abstractfactory.chair.Chair;
import bg.softuni.creational.abstractfactory.coffeetable.ArdDecoCoffeeTable;
import bg.softuni.creational.abstractfactory.coffeetable.CoffeeTable;
import bg.softuni.creational.abstractfactory.sofa.ArtDecoSofa;
import bg.softuni.creational.abstractfactory.sofa.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArdDecoCoffeeTable();
    }
}
