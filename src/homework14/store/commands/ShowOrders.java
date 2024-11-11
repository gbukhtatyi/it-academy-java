package homework14.store.commands;

import homework14.store.Order;

import java.util.ArrayList;

public class ShowOrders {
    public static void execute(ArrayList<Order> orders) {
        System.out.println("\nСписок заказов");
        System.out.printf("%-20s", "Номер заказа");
        System.out.printf("%-10s%n", "Сумма заказа");
        System.out.println("===================================");

        if (orders.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            for (Order order : orders) {
                System.out.printf("%-10s", order.getId());
                System.out.printf("%20s%n", order.getTotal());
            }
        }
    }
}
