package lab10.Exercise1;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random number: " + randomSupplier.get());
    }
}
