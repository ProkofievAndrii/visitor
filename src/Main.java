

import domain.Electronics;
import domain.Food;
import operations.ExportAuditVisitor;
import operations.JsonExportVisitor;
import operations.TaxVisitor;
import domain.Cart;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addItem(new Electronics("MacBook Pro", 2500.0));
        cart.addItem(new Electronics("iPhone 15", 1000.0));
        cart.addItem(new Food(2.5, 10.0));
        cart.addItem(new Food(0.5, 50.0));

        System.out.println("=== ТЕСТ: VISITOR\n");

        // 2. Тест 1: Export у JSON, додавання формат виводу без зміни класів домену
        System.out.println("--- Експорт структури в JSON");
        cart.applyVisitor(new JsonExportVisitor());
        System.out.println("------------------------------------");

        // 3. Тест 2: Логіка з накопиченням стану, Збір даних з усієї структури
        System.out.println("--- Розрахунок податків/Stateful Visitor");
        TaxVisitor taxCalc = new TaxVisitor();
        cart.applyVisitor(taxCalc);
        System.out.println(STR."SUM: \{taxCalc.getTotalTax()}");
        System.out.println("------------------------------------");

        // 4. Тест 3: Singleton Visitor
        System.out.println("--- Перевірка безпеки експорту ---");
        cart.applyVisitor(ExportAuditVisitor.INSTANCE);
        System.out.println("------------------------------------");
    }
}