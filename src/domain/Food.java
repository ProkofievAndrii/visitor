package domain;

import operations.Visitor;

public class Food implements Item {
    private double weight;
    private double pricePerKg;

    public Food(double weight, double pricePerKg) {
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    public double getWeight() { return weight; }
    public double getPricePerKg() { return pricePerKg; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
