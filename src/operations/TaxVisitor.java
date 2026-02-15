package operations;

import domain.Electronics;
import domain.Food;


public class TaxVisitor implements Visitor {
    private double totalTax = 0;

    @Override
    public void visit(Electronics electronics) {
        double tax = electronics.getBasePrice() * 0.20;
        totalTax += tax;
        System.out.println(STR."Податок: \{electronics.getModel()}: \{tax}");
    }

    @Override
    public void visit(Food food) {
        double tax = (food.getWeight() * food.getBasePrice()) * 0.05;
        totalTax += tax;
        System.out.println(STR."Податок (\{food.getWeight()}кг): \{tax}");
    }

    public double getTotalTax() { return totalTax; }
}
