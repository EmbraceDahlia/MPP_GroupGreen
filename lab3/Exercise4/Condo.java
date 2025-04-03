package lab3.Exercise4;

public class Condo extends Property {

    private int numberOfFloors;

    public Condo(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public double computeRent() {
        return 500 * numberOfFloors;
    }
}
