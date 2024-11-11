package homework14.store.commands;

import homework14.store.Order;
import util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class EditOrder {
    public static void execute(ArrayList<Order> orders) {
        ShowOrders.execute(orders);

        Order currentOrder = null;
        do {
            Scanner sc = new Scanner(System.in);
            int id = Input.getNumber("\nВведите номер заказа для редактирования: ");

            for (Order order : orders) {
                if (order.getId() == id) {
                    currentOrder = order;
                }
            }
        } while (currentOrder == null);

        FormOrder.execute(currentOrder);
    }
}
