package homework14.store.commands;

import homework14.store.Order;
import util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveOrder {
    public static void execute(ArrayList<Order> orders) {
        ShowOrders.execute(orders);

        Scanner sc = new Scanner(System.in);
        int id = Input.getNumber("\nВведите номер заказа для удаления: ");

        orders.removeIf(order -> order.getId() == id);
    }
}
