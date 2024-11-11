package homework14.store.commands;

import homework14.store.Order;
import util.Input;

import java.util.Scanner;

public class FormOrder {
    public static void execute(Order order) {
        int selection;
        do {
            ShowOrderItems.execute(order);

            System.out.println("\nДоступные команды:");
            System.out.println("[0] Завершить создание заказа и вернуться в главное меню");
            System.out.println("[1] Добавить товар");
            System.out.println("[2] Удалить товар");

            Scanner sc = new Scanner(System.in);
            selection = Input.getNumberGreater("\nВведите номер действия: ", 0);

            switch (selection) {
                case 1:
                    order.addItem(CreateOrderItem.execute());
                    break;
                case 2:
                    RemoveOrderItem.execute(order);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid selection");
            }
        } while (selection != 0);
    }
}
