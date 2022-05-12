package bg.softuni.structural.composite;

import java.util.List;

public class ImageEditor {
    private final CompoundGraphic all;

    public ImageEditor() {
        this.all = new CompoundGraphic();
    }

    public void load() {
        all.add(new Dot(10, 20));
        all.add(new Circle(30,30, 10d));
        CompoundGraphic graphic = new CompoundGraphic();
        graphic.add(new Dot(50, 50));
        graphic.add(new Circle(70,70, 20d));
        all.add(graphic);
        all.add(new Dot(80, 100));
    }

    public void groupSelected(List<Graphic> components) {
        CompoundGraphic group = new CompoundGraphic();
        for (Graphic component : components) {
            group.add(component);
            all.remove(component);
        }
        all.add(group);
        all.draw();
    }
}
