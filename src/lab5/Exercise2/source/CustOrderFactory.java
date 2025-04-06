package lab5.Exercise2.source;

import java.time.LocalDate;
import java.util.List;

final public class CustOrderFactory {
    private CustOrderFactory() {
    }

    public static ICustomerWithOrders createCustomerWithOrders(String customerName) {
        return new CustomerWithOrdersImplementation(customerName);
    }

    public static void addOrderToCustomer(Customer customer, LocalDate date, List<String> itemNames) {
        new CustomerWithOrdersImplementation(customer, date, itemNames);
    }
}
