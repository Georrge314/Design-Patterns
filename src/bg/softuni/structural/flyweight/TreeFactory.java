package bg.softuni.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class TreeFactory {
    private static final List<TreeType> treeTypes = new ArrayList<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        for (TreeType treeType : treeTypes) {
            if (treeType.getName().equals(name) &&
                    treeType.getColor().equals(color) &&
                    treeType.getTexture().equals(texture)) {
                return treeType;
            }
        }
        TreeType treeType = new TreeType(name, color, texture);
        treeTypes.add(treeType);
        return treeType;
    }
}
