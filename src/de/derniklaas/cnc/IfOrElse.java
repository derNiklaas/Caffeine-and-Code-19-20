package de.derniklaas.cnc;

import java.util.Base64;

public class IfOrElse {

    public static void run() {
        boolean a = true;

        if (a == true) {
            System.out.println(hochkomplizierteFunktion());
        } else {
            System.out.println("Nein");
        }
    }


    public static String hochkomplizierteFunktion() {
        return new String(Base64.getDecoder().decode("SWZFQXN5QmVIQXBweQo="));
    }
}
