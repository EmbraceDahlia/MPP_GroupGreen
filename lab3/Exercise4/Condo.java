package lab3.Exercise4;

public class Condo  {

	private int numberOfFloors;
	
	public Condo(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	public double computeRent(){
		return 500 * numberOfFloors;
	}
}
