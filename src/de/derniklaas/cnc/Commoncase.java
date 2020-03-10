package de.derniklaas.cnc;

public class Commoncase {

    public static class Pixel {
        int x;
        int y;
        int brightness;

        public Pixel(int x, int y, int brightness) {
            this.x = x;
            this.y = y;
            this.brightness = brightness;
        }

        @Override
        public String toString() {
            return String.format("(%d;%d)=%d", x, y, brightness);
        }
    }

    public static void modify(Pixel p, String instruction) {
        switch (instruction) {
            case "light": {
                p.brightness++;
                break;
            }
            case "dim": {
                p.brightness--;
                break;
            }
            case "mirror-h": {
                p.x = -p.x;
                break;
            }
            case "mirror-p0": {
                p.x = -p.x;
                p.y = -p.y;
                break;
            }
            case "chaos": {
                modify(p, "mirror-p0");
                p.brightness *= 2;
            }
        }
    }

    public static void run() {
        Pixel p1 = new Pixel(1, 2, 0);
        Pixel p2 = new Pixel(-1, 3, 4);
        Pixel p3 = new Pixel(10, 12, 7);

        modify(p1, "dim");
        modify(p1, "mirror-h");
        modify(p1, "mirror-p0");
        modify(p2, "chaos");
        modify(p1, "mirror-p0");
        modify(p3, "mirror-p0");
        modify(p1, "chaos");
        modify(p3, "chaos");
        modify(p1, "dim");
        modify(p1, "mirror-h");
        modify(p2, "mirror-p0");
        modify(p2, "chaos");
        modify(p1, "mirror-p0");
        modify(p3, "mirror-p0");
        modify(p1, "chaos");
        modify(p3, "chaos");
        modify(p1, "dim");
        modify(p2, "mirror-h");
        modify(p1, "mirror-p0");
        modify(p2, "chaos");
        modify(p1, "mirror-p0");
        modify(p3, "mirror-p0");
        modify(p1, "chaos");
        modify(p3, "chaos");

        System.out.format("%s %s %s\n", p1, p2, p3);
    }
}
