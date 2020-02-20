package de.derniklaas.cnc;

public class Modulo {

    public static boolean printSeven(int x) {
        return x % 7 == 0;
    }

    public static void run() {
        String toll = "Mölaskdofaig0rD0g43gaUpoi4geldölgsd0lkajsf!lis8ga!adf";
        for (int i = 0; i < 50; i++)
            if (printSeven(i))
                System.out.print(toll.charAt(i));
        System.out.println();

    }

}
