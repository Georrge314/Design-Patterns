package bg.softuni.creational.factorymethod;

import bg.softuni.creational.factorymethod.factory.AirLogistics;
import bg.softuni.creational.factorymethod.factory.Logistics;
import bg.softuni.creational.factorymethod.factory.RoadLogistics;
import bg.softuni.creational.factorymethod.factory.SeaLogistics;

public class Main {
    static int number = 1;

    public static String getDialog() {
        if (number % 2 == 0) {
            number++;
            return "By road";
        } else if (number % 5 == 0) {
            number++;
            return "By air";
        } else {
            number++;
            return "By sea";
        }
    }

    public static void main(String[] args) {
        Logistics roadLogistics = new RoadLogistics();
        Logistics seaLogistics = new SeaLogistics();
        Logistics airLogistic = new AirLogistics();

        for (int i = 0; i <= 40; i++) {
            String dialog = getDialog();
            Transport transport;
            if (dialog.equals("By road")) {
                transport = roadLogistics.createTransport();
            } else if (dialog.equals("By air")) {
                transport = airLogistic.createTransport();
            } else {
                transport = seaLogistics.createTransport();
            }

            transport.deliver();
        }
    }
}
