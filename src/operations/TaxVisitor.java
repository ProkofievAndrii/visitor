package operations;

import domain.Electronics;
import domain.Food;

public class TaxVisitor implements Visitor {
    private double totalTax = 0;

    @Override
    public void visit(Electronics electronics) {
        totalTax += electronics.getPrice() * 0.20;
    }

    @Override
    public void visit(Food food) {
        totalTax += (food.getWeight() * food.getPricePerKg()) * 0.05;
    }
}
