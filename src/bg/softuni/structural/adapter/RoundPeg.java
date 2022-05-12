package bg.softuni.structural.adapter;

public class RoundPeg implements RoundShape {
    private final int radius;

    public RoundPeg(int radius) {
        this.radius = radius;
    }


    @Override
    public int getRadius() {
        return radius;
    }
}
