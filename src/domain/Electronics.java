package domain;

import operations.Visitor;

public class Electronics implements Item {
    private final double price;
    private final String model;

    public Electronics(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public double getPrice() { return price; }
    public String getModel() {
        return model;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
