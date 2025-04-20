package lab11Part2.exercise9;

import java.util.stream.Stream;

public class Main {
    public static void main (String[] args) {
        printSquares(6);
    }

    public static void printSquares(int num) {
        Stream.iterate(1, i -> i + 1).limit(num).forEach((i) -> System.out.println(i * i));
    }
}
