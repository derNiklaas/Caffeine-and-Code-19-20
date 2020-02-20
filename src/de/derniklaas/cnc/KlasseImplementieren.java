package de.derniklaas.cnc;

public class KlasseImplementieren {

    public static void run() {
        Cuboid.run();
    }

    public static class Cuboid {

        private double length;
        private double height;
        private double width;

        /**
         * Konstruktor. Nimmt Höhe, Breite und Länge des Quaders entgegen.
         *
         * @param width  Die Breite.
         * @param height Die Höhe.
         * @param length Die Länge.
         */
        public Cuboid(double width, double height, double length) {
            this.width = width;
            this.height = height;
            this.length = length;
        }

        /**
         * Gibt das Volumen des Quaders zurück.
         *
         * @return Das Volumen.
         */
        public double getVolume() {
            return width * height * length;
        }

        /**
         * Gibt die Oberfläche des Quaders zurück.
         *
         * @return Die Oberfläche.
         */
        public double getSufaceArea() {
            return 2 * (length * width + length * height + height * width);
        }

        public static void run() {
            Cuboid a = new Cuboid(12.5, 12.5, 4.0);
            Cuboid b = new Cuboid(10.0, 23.5, 76.5);
            Cuboid c = new Cuboid(43.25, 21.5, 24.0);
            Cuboid d = new Cuboid(8.0, 4.5, 3.25);
            Cuboid e = new Cuboid(45.25, 1.25, 16.5);
            System.out.print(a.getVolume());
            System.out.print(a.getSufaceArea());
            System.out.print(b.getVolume());
            System.out.print(b.getSufaceArea());
            System.out.print(c.getVolume());
            System.out.print(c.getSufaceArea());
            System.out.print(d.getVolume());
            System.out.print(d.getSufaceArea());
            System.out.print(e.getVolume());
            System.out.println(e.getSufaceArea());
        }

    }

}
