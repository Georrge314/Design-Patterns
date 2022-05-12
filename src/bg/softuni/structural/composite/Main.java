package bg.softuni.structural.composite;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ImageEditor imageEditor = new ImageEditor();
        imageEditor.load();
        imageEditor.groupSelected(List.of(new Dot(10, 20), new Circle(70,70,20d)));
    }
}
