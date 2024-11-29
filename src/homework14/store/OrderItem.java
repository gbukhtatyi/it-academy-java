package homework14.store;

public class OrderItem {

    protected String sku;

    protected int price;

    protected int quantity;

    public OrderItem(String sku, int price, int quantity) {
        if (price < 0) {
            throw new IllegalArgumentException("Цена должна быть больше или равна нулю.");
        }

        this.sku = sku;
        this.price = price;
        this.quantity = quantity;
    }

    //region Getters

    public String getSku() {
        return sku;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    //endregion

}
