package domain;

import operations.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void applyVisitor(Visitor visitor) {
        for (Item item : items) {
            item.accept(visitor);
        }
    }
}