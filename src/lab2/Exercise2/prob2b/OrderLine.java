package src.lab2.Exercise2.prob2b;

public class OrderLine {
    private String itemName;
    private Order order;

    OrderLine(String itemName, Order order) {
        this.itemName = itemName;
        this.order = order;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public String toString() {
        return itemName;
    }
}
