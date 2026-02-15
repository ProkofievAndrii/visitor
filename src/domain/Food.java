package domain;

import operations.Visitor;

public class Food extends AbstractItem {
    private final double weight;

    public Food(double weight, double pricePerKg) {
        super(pricePerKg);
        this.weight = weight;
    }

    public double getWeight() { return weight; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
