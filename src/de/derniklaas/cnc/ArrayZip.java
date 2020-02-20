package de.derniklaas.cnc;

public class ArrayZip {

    public static int[] zip(int[] lhs, int[] rhs) {
        int[] output = new int[lhs.length + rhs.length];
        boolean running = true;
        boolean left = true;
        int posLeft = 0;
        int posRight = 0;
        while (running) {
            if (left) {
                if (lhs.length > posLeft) {
                    output[posLeft + posRight] = lhs[posLeft];
                    posLeft++;
                } else {
                    running = false;
                }
            } else {
                if (rhs.length > posRight) {
                    output[posRight + posLeft] = rhs[posRight];
                    posRight++;
                } else {
                    running = false;
                }
            }
            left = !left;
        }
        return output;
    }

    public static void run() {
        int check = 0;
        int[] l = {988, 128, -123123, 420, 484, 1337, 1234567, 887, -690, 500, 77, 498, -330};
        int[] r = {90, 812, 89, 2, 9128, -1238, 85, 9810932, 59, 1009, 1982, 991234, 92812, 4893, 119};

        System.out.print("Zipped:");
        int idx = 0;
        for (int i : zip(l, r)) {
            check += i * i * (i + idx);
            //System.out.format(" %d", i);
        }
        System.out.format("%d\n", check);
    }
}
