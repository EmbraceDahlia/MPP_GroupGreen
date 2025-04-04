package src.lab3.Exercise4;

public class House extends Property {

    private double lotSize;

    public House(double lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double computeRent() {
        return 0.1 * lotSize;
    }
}
