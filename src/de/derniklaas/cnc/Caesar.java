package de.derniklaas.cnc;

public class Caesar {

    static String toSolve = "CLPPxSBoP`EIRPpBirkdz";
    static int offset = 3;

    public static String solveCaesar(String a, int o) {
        StringBuilder output = new StringBuilder();
        for (char c : a.toCharArray()) {
            output.append((char) (3 + c));
        }
        return output.toString();
    }

    public static void run() {
        System.out.println(solveCaesar(toSolve, offset));
    }
}
