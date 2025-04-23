package lab13.Exercise4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class b {
    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for(Number num : nums) s += num.doubleValue();
        return s;
    }

    public static void main(String[] args) {
        List<Object> objs = new ArrayList<>();
        objs.add(1);
        objs.add("two");
        List<? super Integer> ints = objs;
        ints.add(3);
        //double dbl = sum(ints);
    }
}
