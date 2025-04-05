package lab5.Exercise2;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.createCustomerWithOrders("Mike");

		Order order = CustOrderFactory.createOrder(cust);
        order.addItem(CustOrderFactory.createOrderItem("Shirt"));
        order.addItem(CustOrderFactory.createOrderItem("Laptop"));

        order = CustOrderFactory.createOrder(cust);
		order.addItem(CustOrderFactory.createOrderItem("Pants"));
		order.addItem(CustOrderFactory.createOrderItem("Knife set"));

		System.out.println(cust.getOrders());
	}
}

		
