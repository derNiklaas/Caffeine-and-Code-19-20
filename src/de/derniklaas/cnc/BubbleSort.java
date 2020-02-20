package de.derniklaas.cnc;

public class BubbleSort {

    private static int count;

    public static void swp(int[] array, int i, int j) {
        array[i] ^= array[j];
        array[j] ^= array[i];
        array[i] ^= array[j];
        count++;
    }

    public static void bubblesort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swp(arr, j, j + 1);
                }
            }
        }
    }
    
    public static void run() {
        int[] input = {1, 2, 8, 1098, 1971, 6, 23187, -23, 4029, 497, -440, 889, 123123, 89};
        long check = 0;
        count = 0;

        bubblesort(input);

        for (int i : input) {
            /* Nicht Kommutative Funktion (Sortierung und Anzahl der Tauschungen müssen gegeben sein) */
            check = ((long) Math.pow(check - (i + count), 2)) % 100000;
        }

        System.out.format("Flag: %d\n", check);
    }
}
