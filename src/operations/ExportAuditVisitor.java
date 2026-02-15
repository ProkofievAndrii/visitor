package operations;

import domain.Electronics;
import domain.Food;

/**
 * Конкретный посетитель, реализующий аудит товаров перед экспортом.
 * Позволяет добавить логику проверки без изменения классов Electronics и Food.
 */
public class ExportAuditVisitor implements Visitor {

    @Override
    public void visit(Electronics electronics) {
        System.out.println("--- Аудит электроники ---");
        if (electronics.getModel().toLowerCase().contains("pro")) {
            System.out.println(STR."Модель \{electronics.getModel()}: Требуется расширенная лицензия.");
        } else {
            System.out.println(STR."Модель \{electronics.getModel()}: Проверка пройдена.");
        }
    }

    @Override
    public void visit(Food food) {
        System.out.println("--- Аудит продуктов питания ---");
        if (food.getWeight() > 1000) {
            System.out.println(STR."Вес \{food.getWeight()} кг: Необходим фитосанитарный контроль.");
        } else {
            System.out.println(STR."Вес \{food.getWeight()} кг: Партия одобрена к вывозу.");
        }
    }
}
