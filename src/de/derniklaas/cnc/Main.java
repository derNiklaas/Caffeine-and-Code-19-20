package de.derniklaas.cnc;

public class Main {

    public static void main(String[] args) {
        System.out.print("[If, or else?]: ");
        IfOrElse.run();
        System.out.print("[Modulo]: ");
        Modulo.run();
        System.out.print("[Array Summe]: ");
        ArraySumme.run();
        System.out.print("[If function]: ");
        IfFunction.run();
        System.out.print("[Minimum or Maximum]: ");
        MininumOrMaximum.run();
        System.out.print("[Base 64]: ");
        Base64.run();
        System.out.print("[Caeser]: ");
        Caesar.run();
        System.out.print("[Ziffer Summieren]: ");
        ZifferSummieren.run();
        System.out.print("[Bubblesort]: ");
        BubbleSort.run();
    }
}
