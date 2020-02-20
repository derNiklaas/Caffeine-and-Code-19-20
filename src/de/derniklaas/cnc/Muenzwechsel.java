package de.derniklaas.cnc;

public class Muenzwechsel {

    public static int pickCoins(int rest) {
        if (rest >= 20) {
            return pickCoins(rest - 20) + 1;
        } else if (rest >= 10) {
            return pickCoins(rest - 10) + 1;
        } else if (rest >= 5) {
            return pickCoins(rest - 5) + 1;
        } else if (rest >= 2) {
            return pickCoins(rest - 2) + 1;
        } else if (rest >= 1) {
            return pickCoins(rest - 1) + 1;
        } else {
            return 0;
        }
    }

    public static void run() {
        int[] input = {1, 2, 5, 8, 10, 19, 20, 133, 49, -1, 0, 8543, 1817, 7, 9999};
        int check = 0;

        for (int i : input) {
            int res = pickCoins(i);
            check += res;
            //System.out.format("Value: %d -> \t%d Coins\n", i, res);
        }

        System.out.format("%d\n", check);
    }

}
