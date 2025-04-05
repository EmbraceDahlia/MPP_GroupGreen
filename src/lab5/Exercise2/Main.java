package lab5.Exercise2;

import lab5.Exercise2.source.CustOrderFactory;
import lab5.Exercise2.source.Customer;
import lab5.Exercise2.source.ICustomerWithOrders;
import lab5.Exercise2.source.Order;

public class Main {
	public static void main(String[] args) {
		ICustomerWithOrders customerWithOrders = CustOrderFactory.createCustomerWithOrders("Mike");

		Order order = customerWithOrders.createOrder();
		order.addItem("Shirt");
		order.addItem("Laptop");

        order = customerWithOrders.createOrder();
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(customerWithOrders.getCustomer().getOrders());
	}
}

		
