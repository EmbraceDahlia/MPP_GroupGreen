package src.lab3.Exercise4;

public class Driver {

	public static void main(String[] args) {

		Property[] properties = { new House(9000), new Condo(2), new Trailer() };
		double totalRent = Admin.computeTotalRent(properties);
		System.out.println(totalRent);
	}
}
