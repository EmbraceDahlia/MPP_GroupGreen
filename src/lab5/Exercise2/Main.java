package lab5.Exercise2;

import lab5.Exercise2.source.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		ICustomerWithOrders customerWithOrders = CustOrderFactory.createCustomerWithOrders("Mike");
		List<String> itemNames = new ArrayList<>();
		itemNames.add("Shirt");
		itemNames.add("Laptop");
		CustOrderFactory.addOrderToCustomer(customerWithOrders.getCustomer(), LocalDate.now(),itemNames);
		System.out.println(customerWithOrders.getCustomer().getName());
		System.out.println(customerWithOrders.getCustomer().getOrders());
		itemNames = new ArrayList<>();
		itemNames.add("Pants");
		itemNames.add("Knife set");
		CustOrderFactory.addOrderToCustomer(customerWithOrders.getCustomer(), LocalDate.now().minusDays(2),itemNames);
		System.out.println(customerWithOrders.getCustomer().getName());
		System.out.println(customerWithOrders.getCustomer().getOrders());

//		Order order = customerWithOrders.createOrder();
//		order.addItem("Shirt");
//		order.addItem("Laptop");

//      order = customerWithOrders.createOrder();
//		order.addItem("Pants");
//		order.addItem("Knife set");

//		System.out.println(customerWithOrders.getCustomer().getOrders());
	}
}

		
