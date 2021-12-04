package bg.softuni.creational.builder;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        System.out.println(carBuilder.getResult().getCarType());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);

        System.out.println(carManualBuilder.getResult().print());
    }
}
