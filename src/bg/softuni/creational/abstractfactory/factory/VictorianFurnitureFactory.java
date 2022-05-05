package bg.softuni.creational.abstractfactory.factory;

import bg.softuni.creational.abstractfactory.chair.Chair;
import bg.softuni.creational.abstractfactory.coffeetable.CoffeeTable;
import bg.softuni.creational.abstractfactory.coffeetable.VictorianCoffeeTable;
import bg.softuni.creational.abstractfactory.sofa.Sofa;
import bg.softuni.creational.abstractfactory.chair.VictorianChair;
import bg.softuni.creational.abstractfactory.sofa.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
