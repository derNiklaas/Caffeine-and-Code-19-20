package de.derniklaas.cnc;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;


public class Primzahlen {

    private static final int BOUND = 100000;

    public static void run() throws NoSuchAlgorithmException {
        //System.out.println("> Calculating prime numbers");
        int[] primes = getPrimes();
        //System.out.print("Highest: ");
        //System.out.println(primes[primes.length - 1]);

        //System.out.println("> Calculating flag");
        byte[] bytes = new byte[primes.length * 4];
        for (int i = 0; i < primes.length; i++) {
            bytes[i * 4 + 3] = (byte) ((primes[i]) & 0xFF);
            bytes[i * 4 + 2] = (byte) ((primes[i] >> 8) & 0xFF);
            bytes[i * 4 + 1] = (byte) ((primes[i] >> 16) & 0xFF);
            bytes[i * 4] = (byte) ((primes[i] >> 24) & 0xFF);
        }

        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(bytes);

        // To HEX String
        StringBuilder sb = new StringBuilder();
        for (byte b : hash) {
            sb.append(String.format("%02x", b));
        }
        System.out.println(sb.toString());
    }

    private static int[] getPrimes() {
        List<Integer> primes = new ArrayList<>();
        for (int i = 1; i < BOUND; i++) {

            int counter = 0;
            for (int j = 1; j < i + 1; j++) {
                if (i % j == 0) counter++;
                if (counter > 2) break;
            }
            if (counter == 2) {
                primes.add(i);
            }
        }
        int[] output = new int[primes.size()];
        // primes.toArray didnt want to work :/
        for (int i = 0; i < primes.size(); i++) {
            output[i] = primes.get(i);
        }
        return output;
    }

}
