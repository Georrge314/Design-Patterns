package bg.softuni.structural.adapter;

public class RoundHole implements RoundShape {
    private final int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    @Override
    public int getRadius() {
        return radius;
    }

    public boolean fits(RoundShape roundShape) {
        return this.radius >= roundShape.getRadius();
    }
}
