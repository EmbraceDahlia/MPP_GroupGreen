package lab11.exercise3;

import java.util.stream.Stream;

public class PrimeStream {
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private int nextPrime(int current) {
        int next = current + 1;
        while (!isPrime(next)) {
            next++;
        }
        return next;
    }

    private Stream<Integer> generatePrimes() {
        return Stream.iterate(2, this::nextPrime);
    }

    public void printFirstNPrimes(long n) {
        generatePrimes()
                .limit(n)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream();
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }
}
