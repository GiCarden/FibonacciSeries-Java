
/**
 *  Write a java program to print the fibonacci series with and without recursion.
 *
 *  A series of numbers in which each number (Fibonacci number) is the sum of the two preceding numbers.
 *  The simplest is the series 1, 1, 2, 3, 5, 8, etc.
 *
 *  Test Class
 */
public class Main {

    public static void main(String[] args) {

        int n = 20;

        System.out.println();
        FibonacciSeries.fib_0(n+1);
        System.out.println();

        System.out.println();
        FibonacciSeries.fib_1(n+1);
        System.out.println();

        System.out.println();
        System.out.println(FibonacciSeries.fib_3(n));
    }
}
