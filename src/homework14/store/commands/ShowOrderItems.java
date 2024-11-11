package homework14.store.commands;

import homework14.store.Order;
import homework14.store.OrderItem;

public class ShowOrderItems {
    public static void execute(Order order) {
        System.out.println("\nСписок продуктов в заказе");
        System.out.printf("%-10s", "Штрих код");
        System.out.printf("%-10s", "Цена");
        System.out.printf("%-10s%n", "Кол-во");
        System.out.println("===================================");

        if (order.getItems().isEmpty()) {
            System.out.println("Список пуст");
        } else {
            for (OrderItem item : order.getItems()) {
                System.out.printf("%-10s", item.getSku());
                System.out.printf("%-10s", item.getPrice());
                System.out.printf("%-10s%n", item.getQuantity());
            }
        }
    }
}
