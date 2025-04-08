package lab5.Exercise2.source;

import java.time.LocalDate;
import java.util.List;

public class CustomerWithOrdersImplementation implements ICustomerWithOrders {
    private Customer customer;

    CustomerWithOrdersImplementation(String customerName) {
        this.customer = Customer.newCustomer(customerName);
    }

    CustomerWithOrdersImplementation(Customer customer, LocalDate date, List<String> itemNames) {
        this.customer = customer;
//        Order o = Order.newOrder(customer, date);
//        for (String itemName : itemNames) {
//            o.addItem(itemName);
//        }
    }

    @Override
    public Customer getCustomer() {
        return this.customer;
    }

    @Override
    public Order createOrder() {
        return Order.newOrder(customer, LocalDate.now());
    }
}
