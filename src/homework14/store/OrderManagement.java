package homework14.store;

import homework14.store.Order;
import util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderManagement {

    //region Grids

    public static void showOrders(ArrayList<Order> orders) {
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

    public static void showOrderItems(Order order) {
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

    //endregion

    //region Orders

    public static Order createOrder() {
        Order order = new Order();

        showFormOrder(order);

        return order;
    }

    public static void showFormOrder(Order order) {
        int selection;
        do {
            showOrderItems(order);

            System.out.println("\nДоступные команды:");
            System.out.println("[0] Завершить создание заказа и вернуться в главное меню");
            System.out.println("[1] Добавить товар");
            System.out.println("[2] Удалить товар");

            Scanner sc = new Scanner(System.in);
            selection = Input.getNumberGreater("\nВведите номер действия: ", 0);

            switch (selection) {
                case 1:
                    order.addItem(createOrderItem());
                    break;
                case 2:
                    removeOrderItem(order);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid selection");
            }
        } while (selection != 0);
    }

    public static void editOrder(ArrayList<Order> orders) {
        showOrders(orders);

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

        showFormOrder(currentOrder);
    }

    public static void removeOrder(ArrayList<Order> orders) {
        showOrders(orders);

        Scanner sc = new Scanner(System.in);
        int id = Input.getNumber("\nВведите номер заказа для удаления: ");

        orders.removeIf(order -> order.getId() == id);
    }

    //endregion

    //region OrderItems

    public static OrderItem createOrderItem() {
        String sku = Input.getText("\nВведите штрих код продукта:");
        int price = Input.getNumberGreater("Введите цену продукта:", 0);
        int quantity = Input.getNumberGreater("Введите цену продукта:", 0);

        return new OrderItem(sku, price, quantity);
    }

    public static void removeOrderItem(Order order) {
        showOrderItems(order);

        Scanner sc = new Scanner(System.in);
        String sku = Input.getText("\nВведите штрих код продукта для удаления: ");

        order.removeItemBySku(sku);
    }

    //endregion

}
