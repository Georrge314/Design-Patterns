package bg.softuni.creational.prototype;

public class Button implements Prototype {
    private final int width;
    private final int height;
    private final String color;

    public Button(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Prototype clone() {
        return new Button(width, height, color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Button button = (Button) o;
        return width == button.width && height == button.height && color.equals(button.color);
    }

}
