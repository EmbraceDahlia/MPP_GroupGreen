package lab5.Exercise2.source;

import java.time.LocalDate;

final public class CustOrderFactory {
    private CustOrderFactory(){}

    public static ICustomerWithOrders createCustomerWithOrders(String customerName) {
        return new CustomerWithOrdersImplementation(customerName);
    }
}
