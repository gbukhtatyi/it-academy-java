package homework14;

import homework14.store.Order;
import homework14.store.OrderManagement;
import util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework14 {
    protected static ArrayList<Order> orders;

    public static void main(String[] args) {
        System.out.println("Программа для учета заказов в интернет-магазине:");
        System.out.println("создать класс Order, который содержит информацию о заказе (например номер заказа, список товаров (Item)");
        System.out.println("и их стоимость) и методы для добавления товаров, удаления товаров, вычисления общей стоимости заказа;");
        System.out.println("программа должна позволять добавлять новые заказы, удалять заказы, а также вычислять общую сумму всех заказов;");
        System.out.println("также необходимо реализовать методы для добавления заказа, удаления заказа и вычисления общей суммы всех заказов");

        orders = new ArrayList<Order>();

        int selection = 0;
        do {
            OrderManagement.showOrders(orders);

            System.out.println("\nДоступные команды:");
            System.out.println("[0] Выход");
            System.out.println("[1] Создать заказ");
            System.out.println("[2] Редактирование заказа");
            System.out.println("[3] Удаление заказа");

            Scanner sc = new Scanner(System.in);
            selection = Input.getNumberGreater("\nВведите номер действия: ", 0);

            switch (selection) {
                case 1:
                    Order order = OrderManagement.createOrder();
                    orders.add(order);
                    break;
                case 2:
                    OrderManagement.editOrder(orders);
                    break;
                case 3:
                    OrderManagement.removeOrder(orders);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid selection");
            }
        } while (selection != 0);
    }
}