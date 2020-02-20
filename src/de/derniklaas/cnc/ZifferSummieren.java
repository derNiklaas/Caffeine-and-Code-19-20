package de.derniklaas.cnc;

public class ZifferSummieren {

    public static int sum(String[] zahlen) {
        int sum = 0;

        for (String s : zahlen) {
            switch (s) {
                case "eins": {
                    sum += 1;
                    break;
                }
                case "zwei": {
                    sum += 2;
                    break;
                }
                case "drei": {
                    sum += 3;
                    break;
                }
                case "vier": {
                    sum += 4;
                    break;
                }
                case "fünf": {
                    sum += 5;
                    break;
                }
                case "sechs": {
                    sum += 6;
                    break;
                }
                case "sieben": {
                    sum += 7;
                    break;
                }
                case "acht": {
                    sum += 8;
                    break;
                }
                case "neun": {
                    sum += 9;
                    break;
                }
                case "null": {
                    sum += 0;
                    break;
                }
                default:
                    sum -= 1;
            }
        }

        return sum;
    }

    public static void run() {
        String[] zahlen = {"eins", "sechs", "neun", "zwei", "vier", "sechs", "zwei",
                "nil", "drei", "fünf", "schieben", "acht", "neun", "fünf",
                "drei", "acht", "neun", "eins", "eins", "fünf", "vier",
                "drei", "sechs", "drölf", "keine Zahl"};
        System.out.println(sum(zahlen));
    }
}
