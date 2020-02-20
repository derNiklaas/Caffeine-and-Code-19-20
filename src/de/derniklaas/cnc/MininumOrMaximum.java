package de.derniklaas.cnc;

public class MininumOrMaximum {

    public static int minmax(int a, int b, boolean max) {
        if (max) return Math.max(a, b);
        return Math.min(a, b);
    }


    public static void run() {
        int[] ints = {6, 1, 79, 2, 43, -1, 2, 6, 0, 0, 123, 5, 7, 7, -1, -1, 4, 9};
        boolean max = false;
        for (int i = 1; i < ints.length; i += 2) {
            System.out.print(minmax(ints[i - 1], ints[i], max = !max));
        }
        System.out.print("\n");
    }
}
