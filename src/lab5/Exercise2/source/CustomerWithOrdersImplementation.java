package lab5.Exercise2.source;

import java.time.LocalDate;
import java.util.List;

public class CustomerWithOrdersImplementation implements ICustomerWithOrders {
    private Customer customer;

    CustomerWithOrdersImplementation(String customerName) {
        this.customer = Customer.newCustomer(customerName);;
    }

    public Order createOrder() {
        return Order.newOrder(customer, LocalDate.now());
    }

    public Customer getCustomer() {
        return this.customer;
    }
}
