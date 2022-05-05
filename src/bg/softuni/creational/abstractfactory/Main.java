package bg.softuni.creational.abstractfactory;

import bg.softuni.creational.abstractfactory.chair.Chair;
import bg.softuni.creational.abstractfactory.coffeetable.CoffeeTable;
import bg.softuni.creational.abstractfactory.factory.ArtDecoFurnitureFactory;
import bg.softuni.creational.abstractfactory.factory.FurnitureFactory;
import bg.softuni.creational.abstractfactory.sofa.Sofa;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new ArtDecoFurnitureFactory();

        //client code
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable coffeeTable = factory.createCoffeeTable();
        chair.sitOn();
        sofa.sitOn();
        coffeeTable.placeAnObject("Cup of coffee");
    }
}
