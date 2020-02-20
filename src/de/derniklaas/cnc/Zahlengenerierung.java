package de.derniklaas.cnc;

public class Zahlengenerierung {
    public static int x(int n, int c) {
        if (n == 0) return c * 2;

        return x(n - 1, c) * 2 + c;
    }

    public static void run() {
        int[] input = {10, 3, 20, 2, 15, 1, 2, 123, 9, 90, 4, -2, 12, 2};
        int check = 0;

        for (int i = 0; i < input.length; i += 2) {
            int res = x(input[i], input[i + 1]);
            check += res;
            //System.out.format("(c=%d) X_%d \t= %d\n", input[i + 1], input[i], res);
        }

        System.out.format("Flag: %d\n", check);
    }
}
