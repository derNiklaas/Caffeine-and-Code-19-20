import java.util.Base64;

public class Hash {
    public static abstract class Container {
        int dummy;

        public abstract Hash.Container put(int i);
    }

    public static boolean notEqual(Hash.Container a, Hash.Container b) {
        return a.getClass() == b.getClass() && a.dummy == b.dummy && a.hashCode() == b.hashCode();
    }


    public static void main(String[] args) {
        String secret = "yv66vgAAADQAKgoACAAbCgAcAB0JAAcAHgkABwAfCQAHACAJAAcAIQcAIwcAJQEAAmkxAQABSQEA" +
                "AmkyAQACaTMBAARiaWFzAQABRAEABjxpbml0PgEAAygpVgEABENvZGUBAA9MaW5lTnVtYmVyVGFi" +
                "bGUBAANwdXQBAAlDb250YWluZXIBAAxJbm5lckNsYXNzZXMBABcoSSlMVGVtcGxhdGUkQ29udGFp" +
                "bmVyOwEACGhhc2hDb2RlAQADKClJAQAKU291cmNlRmlsZQEADVRlbXBsYXRlLmphdmEMAA8AEAcA" +
                "JgwAJwAoDAANAA4MAAkACgwACwAKDAAMAAoHACkBAA9UZW1wbGF0ZSRTZWNyZXQBAAZTZWNyZXQB" +
                "ABJUZW1wbGF0ZSRDb250YWluZXIBAA5qYXZhL2xhbmcvTWF0aAEABnJhbmRvbQEAAygpRAEACFRl" +
                "bXBsYXRlACEABwAIAAAABAAAAAkACgAAAAAACwAKAAAAAAAMAAoAAAAAAA0ADgAAAAMAAQAPABAA" +
                "AQARAAAALAADAAEAAAAMKrcAASq4AAK1AAOxAAAAAQASAAAADgADAAAAEQAEABIACwATAAEAEwAW" +
                "AAEAEQAAAD4AAwACAAAAGiobEGRwtQAEKhsQMnC1AAUqGxAecLUABiqwAAAAAQASAAAAEgAEAAAA" +
                "FgAIABcAEAAYABgAGQABABcAGAABABEAAAAnAAIAAQAAAA8qtAAEKrQABWAqtAAGYKwAAAABABIA" +
                "AAAGAAEAAAAcAAIAGQAAAAIAGgAVAAAAEgACAAgAIgAUBAkABwAiACQACQ==";

        Class<?> cls = null;
        try {
            cls = new ClassLoader() {
                public Class<?> findClass(String name) {
                    byte[] b = Base64.getDecoder().decode(secret);
                    return defineClass(name, b, 0, b.length);
                }
            }.loadClass(Hash.class.getName() + "$Secret");
        } catch (ClassNotFoundException | NoClassDefFoundError e) {
            System.err.println("Diese Klasse ist nicht dafür geeignet in einem Paket kompiliert zu werden.");
            System.err.println("  Kompliliere sie (ohne package;) mit javac <Datei> selbst.");
            return;
        }

        Hash.Container[] cs = new Hash.Container[6];
        try {
            cs[0] = ((Hash.Container) cls.getDeclaredConstructor().newInstance()).put(1650);
            cs[1] = ((Hash.Container) cls.getDeclaredConstructor().newInstance()).put(1651);
            cs[2] = ((Hash.Container) cls.getDeclaredConstructor().newInstance()).put(1050);
            cs[3] = ((Hash.Container) cls.getDeclaredConstructor().newInstance()).put(1351);
            cs[4] = ((Hash.Container) cls.getDeclaredConstructor().newInstance()).put(1350);
            cs[5] = ((Hash.Container) cls.getDeclaredConstructor().newInstance()).put(3400);
        } catch (Exception e) {
        }

        String flag = "";
        for (Hash.Container i : cs) {
            for (Container j : cs)
                flag += notEqual(i, j) ? "1" : "0";
        }

        System.out.println("Flag: " + flag);
    }
}
