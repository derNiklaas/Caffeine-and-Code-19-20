package de.derniklaas.cnc;

public class IfFunction {

    public static String containsA(String a, String x) {
        return x.contains(a) ? "Ja" : "Nein";
    }

    public static void run() {
        String[] arra = {"u", "On", "§r", "4", "98", "urafbad", "aierj", "S"};
        String[] arrx = {"fredo", "COn", "ucn", "t4In", "uc", "oin", "0erg", "S"};
        for (int i = 0; i < arra.length; i++)
            if (containsA(arra[i], arrx[i]).equals("Ja"))
                System.out.print(arrx[i]);
            else if (!containsA(arra[i], arrx[i]).equals("Nein"))
                System.out.print("Du hast etwas Falsch gemacht");
        System.out.println();

    }

}
