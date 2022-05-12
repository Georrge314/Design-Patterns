package bg.softuni.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {
    private final List<Graphic> children = new ArrayList<>();

    public void add(Graphic child) {
        children.add(child);
    }

    public void remove(Graphic child) {
        int index = findIndex(child);
        if (index >= 0) {
            children.remove(index);
        }
    }

    private int findIndex(Graphic graphic) {
        for (int i = 0; i < children.size(); i++) {
            Graphic child = children.get(i);
            if (child.equals(graphic)) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public void move(int x, int y) {
        for (Graphic child : children) {
            child.move(x, y);
        }
    }

    @Override
    public void draw() {
        for (Graphic child : children) {
            child.draw();
        }
    }
}
