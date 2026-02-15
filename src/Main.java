

import domain.Electronics;
import domain.Food;
import domain.Item;
import operations.ExportAuditVisitor;
import operations.TaxVisitor;
import operations.Visitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = List.of(
                new Electronics("MacBook Pro", 2500.0),
                new Electronics("iPhone 15", 1000.0),
                new Food(1200.0, 2.5),
                new Food(50.0, 10.0)
        );

        Visitor taxVisitor = new TaxVisitor();
        Visitor auditVisitor = new ExportAuditVisitor();

        for (Item item : items) {
            item.accept(taxVisitor);
        }

        System.out.println("\n");

        for (Item item : items) {
            item.accept(auditVisitor);
        }
    }
}