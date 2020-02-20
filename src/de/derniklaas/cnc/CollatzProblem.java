package de.derniklaas.cnc;

public class CollatzProblem {

    public static int collatzSteps(int n) {
        if (n == 1) return 0;
        if (n % 2 == 0) {
            n = n / 2;
        } else {
            n = 3 * n + 1;
        }
        return collatzSteps(n) + 1;
    }

    public static void run() {
        int[] input = {1, 2, 3, 4, 5, 100, 49, 17980, 49, 288, 481, 177, 120, 848, 6981, 94, 123812, 123809};
        int check = 0;

        for (int i : input) {
            int res = collatzSteps(i);
            check += res * i;
            //System.out.format("Collatz(%d)\t-> %d Steps to 1\n", i, res);
        }

        System.out.format("%d\n", check);
    }
}
