package bg.softuni.structural.facade;

//facade interface
public class ShapeMarker {
    private final Shape circle;
    private final Shape rectangle;
    private final Shape square;

    public ShapeMarker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
