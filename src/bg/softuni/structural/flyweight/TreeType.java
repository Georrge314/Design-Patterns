package bg.softuni.structural.flyweight;

public class TreeType {
    private final String name;
    private final String color;
    private final String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y, String canvas) {
        System.out.printf("Name:'%s', Color:'%s', Texture:'%s' Coordinates: x='%d' and y='%d'.%n",
                name, color, texture, x, y);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getTexture() {
        return texture;
    }
}
