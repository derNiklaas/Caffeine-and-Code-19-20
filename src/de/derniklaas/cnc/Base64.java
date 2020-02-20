package de.derniklaas.cnc;

public class Base64 {
    public static String flag = "Rk9TU3tFNHNZX0VuYzBEMW5nfQ==";

    public static void run() {
        System.out.println(new String(java.util.Base64.getDecoder().decode(flag)));
    }
}
