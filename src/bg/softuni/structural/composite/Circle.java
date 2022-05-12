package bg.softuni.structural.composite;

public class Circle extends Dot {
    private final double radius;

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Draw a circle at X='%d' and Y='%d' with radius R='%.2f'.%n", x, y, radius);
    }
}
