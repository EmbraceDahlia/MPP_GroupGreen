package lab10.Exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Double, Double ,List<Double>> func = (x, y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x,y));
            list.add(x * y);
            return list;
        };

        System.out.println("Result: " + func.apply(2.0, 3.0));
    }
}
