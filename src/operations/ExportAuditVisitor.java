package operations;

import domain.Electronics;
import domain.Food;

public enum ExportAuditVisitor implements Visitor {
    INSTANCE;

    @Override
    public void visit(Electronics electronics) {
        System.out.println("--- Аудит экспорту электроніки");
        if (electronics.getModel().toLowerCase().contains("pro")) {
            System.out.println(STR."Модель \{electronics.getModel()}: Примітка: pro.");
        } else {
            System.out.println(STR."Модель \{electronics.getModel()}: Примітка відсутня.");
        }
    }

    @Override
    public void visit(Food food) {
        System.out.println("--- Аудит экспорту продуктів ---");
        if (food.getWeight() > 1000) {
            System.out.println(STR."Вес \{food.getWeight()}кг: Перевищено ліміт ваги.");
        } else {
            System.out.println("Успіх.");
        }
    }
}
