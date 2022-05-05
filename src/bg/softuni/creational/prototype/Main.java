package bg.softuni.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Prototype button1 = new Button(120, 40, "Grey");
        Prototype button2 = new Button(160, 80, "Purple");
        Prototype button3 = new Button(200, 120, "Black");

        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addItem("HomeButton", button1);
        registry.addItem("AboutButton", button2);
        registry.addItem("LoginButton", button3);

        Prototype cloneButton1 = registry.getById("HomeButton");
        Prototype cloneButton2 = registry.getById("AboutButton");
        Prototype cloneButton3 = registry.getByColor("Black");

        System.out.println("must be false:");
        System.out.println(button1 == cloneButton1);
        System.out.println(button2 == cloneButton2);
        System.out.println(button3 == cloneButton3);
        System.out.println("-----------------------------");
        System.out.println("must be true:");
        System.out.println(button1.equals(cloneButton1));
        System.out.println(button2.equals(cloneButton2));
        System.out.println(button3.equals(cloneButton3));
    }
}
