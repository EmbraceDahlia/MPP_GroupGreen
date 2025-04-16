package lab10.Exercise1;

import java.util.function.Supplier;

public class RandomInnerClass {
    public static void main(String[] args) {
        class RandomSupplier implements Supplier<Double> {
            @Override
            public Double get() {
                return Math.random();
            }
        }

        Supplier<Double> randomSupplier = new RandomSupplier();
        System.out.println("Random number: " + randomSupplier.get());

    }
}
