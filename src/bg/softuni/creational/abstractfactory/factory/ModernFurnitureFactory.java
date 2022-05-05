package bg.softuni.creational.abstractfactory.factory;

import bg.softuni.creational.abstractfactory.chair.Chair;
import bg.softuni.creational.abstractfactory.coffeetable.ArdDecoCoffeeTable;
import bg.softuni.creational.abstractfactory.coffeetable.CoffeeTable;
import bg.softuni.creational.abstractfactory.chair.ModernChair;
import bg.softuni.creational.abstractfactory.sofa.ModernSofa;
import bg.softuni.creational.abstractfactory.sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArdDecoCoffeeTable();
    }
}
