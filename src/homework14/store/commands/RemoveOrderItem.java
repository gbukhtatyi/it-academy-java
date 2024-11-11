package homework14.store.commands;

import util.Input;
import homework14.store.Order;
import java.util.Scanner;

public class RemoveOrderItem {
    public static void execute(Order order) {
        ShowOrderItems.execute(order);

        Scanner sc = new Scanner(System.in);
        String sku = Input.getText("\nВведите штрих код продукта для удаления: ");

        order.removeItemBySku(sku);
    }
}
