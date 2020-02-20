package de.derniklaas.cnc;

import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
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
        System.out.print("[Array Zip]: ");
        ArrayZip.run();
        System.out.print("[Primzahlen]: ");
        Primzahlen.run();
        System.out.print("[Methoden aufrufen]: ");
        MethodenAufrufen.run();
        System.out.print("[Fibonacci]: ");
        Fibonacci.run();
        System.out.print("[Klasse implementieren]: ");
        KlasseImplementieren.run();
        System.out.print("[Collatz Problem]: ");
        CollatzProblem.run();
    }
}
