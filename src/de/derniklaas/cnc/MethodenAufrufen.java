package de.derniklaas.cnc;

import java.util.Base64;

public class MethodenAufrufen {
    private String code;

    public MethodenAufrufen(String code) {
        this.code = code;
    }

    public String decode() {
        return new String(Base64.getDecoder().decode(this.code));
    }

    public static String decode(MethodenAufrufen codedMessage) {
        return codedMessage.decode();
    }

    public static void run() {
        MethodenAufrufen code = new MethodenAufrufen("Rk9TU3tEZUNvZGlOR3dpVEhvYkplY3RTfQ==");
        String decoded = decode(code);
        System.out.println(decoded);
    }
}
