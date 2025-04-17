package lab11Part1.exercise3;

import java.util.stream.Stream;

public class PartA {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static int nextPrime(int current) {
        int next = current + 1;
        while (!isPrime(next)) {
            next++;
        }
        return next;
    }

    public static final Stream<Integer> primes = Stream.iterate(2, PartA::nextPrime);

    public static void main(String[] args) {
        primes
                .limit(10)
                .forEach(System.out::println);
    }
}
