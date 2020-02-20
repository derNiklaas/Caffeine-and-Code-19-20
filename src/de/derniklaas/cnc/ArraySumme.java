package de.derniklaas.cnc;

public class ArraySumme {

    public static int sum(int[] zahlen) {
        int sum = 0;
        for (int i : zahlen) {
            sum += i;
        }
        return sum;
    }

    public static void run() {
        int[] zahlen = {988, 128, -123123, 420, 484, 1337, 1234567, 887, -690, 500, 77, 498, -330};
        System.out.println(sum(zahlen));
    }
}
