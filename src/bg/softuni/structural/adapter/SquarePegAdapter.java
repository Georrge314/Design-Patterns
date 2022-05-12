package bg.softuni.structural.adapter;

public class SquarePegAdapter implements RoundShape {
    private final SquareShape squareShape;

    public SquarePegAdapter(SquareShape squareShape) {
        this.squareShape = squareShape;
    }

    @Override
    public int getRadius() {
        return (int) (squareShape.getWidth() * Math.sqrt(2) / 2);
    }
}
