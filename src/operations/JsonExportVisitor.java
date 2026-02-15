package operations;

import domain.Electronics;
import domain.Food;

public class JsonExportVisitor implements Visitor {
    @Override
    public void visit(Electronics e) {
        System.out.println(STR."{\"type\":\"electronics\", \"model\":\"\{e.getModel()}\"}");
    }

    @Override
    public void visit(Food f) {
        System.out.println(STR."{\"type\":\"food\", \"weight\":\{f.getWeight()}}");
    }
}
