package de.derniklaas.cnc;

public class Fibonacci {

    private static int[] fib = new int[40];

    public static void run() {
        fib[0] = 1;
        fib[1] = 1;
        calcFib(2, 40);
        System.out.println(fib[39]);
    }

    private static void calcFib(int current, int until) {
        if (current == until) return;
        fib[current] = fib[current - 1] + fib[current - 2];
        current++;
        calcFib(current, until);
    }

}
