package homework14.store.commands;

import util.Input;
import homework14.store.OrderItem;

public class CreateOrderItem {
    public static OrderItem execute() {
        String sku = Input.getText("\nВведите штрих код продукта:");
        int price = Input.getNumberGreater("Введите цену продукта:", 0);
        int quantity = Input.getNumberGreater("Введите цену продукта:", 0);

        return new OrderItem(sku, price, quantity);
    }
}
