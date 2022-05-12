package bg.softuni.structural.adapter;

public class SquarePeg implements SquareShape {
    private final int width;

    public SquarePeg(int width) {
        this.width = width;
    }

    @Override
    public int getWidth() {
        return width;
    }
}
