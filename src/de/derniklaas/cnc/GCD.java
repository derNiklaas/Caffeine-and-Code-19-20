package de.derniklaas.cnc;

public class GCD {

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void run() {
        int[] input = {11, 7, 100, 50, -86, 42, 65, -30, 5, 3011, 90, 9, 512, 128, 781, 892, -60, 45};
        int check = 0;

        for (int i = 0; i + 1 < input.length; i += 2) {
            int res = gcd(input[i], input[i + 1]);
            check += (res * i * res * i * res);
            System.out.format("gcd(%d,%d) = \t\t%d\n", input[i], input[i + 1], res);
        }

        System.out.format("\nFlag: %d\n", check);
    }
}
