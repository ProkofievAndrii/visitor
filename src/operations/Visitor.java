package operations;

import domain.Electronics;
import domain.Food;

public interface Visitor {
    void visit(Electronics electronics);
    void visit(Food food);
}
