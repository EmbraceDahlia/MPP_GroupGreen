package lab5.Exercise2.source;

import java.time.LocalDate;

public class CustOrderFactory {
    public static Customer createCustomerWithOrders(String customerName) {
        return Customer.newCustomer(customerName);
    }

    public static Order createOrder(Customer cust) {
        return Order.newOrder(cust, LocalDate.now());
    }

    public static Item createOrderItem(String name) {
        return Item.newItem(name);
    }
}
