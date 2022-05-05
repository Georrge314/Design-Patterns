package bg.softuni.creational.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PrototypeRegistry {
    private final Map<String, Prototype> items = new HashMap<>();

    public void addItem(String id, Prototype prototype) {
        items.put(id, prototype);
    }

    public Prototype getById(String id) {
        return items.get(id).clone();
    }

    public Prototype getByColor(String color) {
        Optional<Prototype> optionalPrototype = items.values().stream()
                .filter(p -> p.getColor().equals(color))
                .findFirst();
        return optionalPrototype.map(Prototype::clone).orElse(null);
    }

}
