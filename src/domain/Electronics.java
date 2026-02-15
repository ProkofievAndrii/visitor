package domain;

import operations.Visitor;

public class Electronics extends AbstractItem {
    private final String model;

    public Electronics(String model, double price) {
        super(price);
        this.model = model;
    }

    public String getModel() { return model; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
