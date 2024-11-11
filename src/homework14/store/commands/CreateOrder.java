package homework14.store.commands;

import homework14.store.Order;

public class CreateOrder {
    public static Order execute() {
        Order order = new Order();

        FormOrder.execute(order);

        return order;
    }
}
