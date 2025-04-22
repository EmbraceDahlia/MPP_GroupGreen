package lab13.Exercise5;

import java.util.List;

public class Main {
    public static void main(String[] args) {}

    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
        if (list == null || list.size() < 2) {
            throw new IllegalArgumentException("List must have at least two elements");
        }

        list.sort((i1, i2) -> i1.compareTo(i2));
        return list.get(1);
    }
}
