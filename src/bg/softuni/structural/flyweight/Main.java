package bg.softuni.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                forest.plantTree(x, y, "oak", "green", "texture");
            }
        }
        forest.plantTree(101, 1, "willow", "green", "texture");
        forest.plantTree(101, 2, "poplar", "green", "texture");
        forest.plantTree(101, 3, "palm", "green", "texture");
        forest.draw("My canvas");
    }
}
