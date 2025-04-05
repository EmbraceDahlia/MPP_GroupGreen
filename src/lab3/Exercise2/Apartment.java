package lab3.Exercise2;

public class Apartment {
    private double rentalFee;

    Apartment(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "Rental Fee=" + rentalFee +
                '}';
    }
}
