package homework14.store;

import java.util.ArrayList;

public class Order {
    protected static int incrementalId = 1;

    protected int id;

    protected ArrayList<OrderItem> items;

    public Order() {
        this.items = new ArrayList<OrderItem>();
        id = incrementalId;
        incrementalId++;
    }

    public int getId() {
        return id;
    }

    public int getTotal() {
        int result = 0;
        for (OrderItem item : items) {
            result += item.getPrice();
        }

        return result;
    }

    //region OrderItem

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItemBySku(String sku) {
        items.removeIf(item -> item.getSku().equals(sku));
    }

    //endregion
}
