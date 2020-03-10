package de.derniklaas.cnc;

public class FuegeDemBaumHinzu {

    private static String flag = "";

    public static void dup() {
        flag += "D";
    }

    public static void left() {
        flag += "L";
    }

    public static void right() {
        flag += "R";
    }

    public static class BinaryIntTree {
        private BinaryIntTree leftChild;
        private BinaryIntTree rightChild;
        /* Wert des Knoten */
        private int value;
        /* Anzahl (gleichen) werte im Knoten */
        private int count = 0;

        public void add(int i) {
            if (count == 0) {
                count++;
                value = i;
            } else {
                if (value == i) {
                    dup();
                    count++;
                } else {
                    if (i < value) {
                        if (leftChild == null) {
                            leftChild = new BinaryIntTree();
                        }
                        leftChild.add(i);
                        left();
                    } else {
                        if (rightChild == null) {
                            rightChild = new BinaryIntTree();
                        }
                        rightChild.add(i);
                        right();
                    }
                }
            }
        }
    }

    public static void run() {
        BinaryIntTree root = new BinaryIntTree();
        int[] in = {1000, 2, 7, 519, 1, 6919, 6918, 1, 3, 7, 992, 91, 598132, 69123, 80, -12, 96, 5, 44, 32, 8783};

        for (int i : in) root.add(i);
        System.out.format("Flag: %s\n", flag);
    }

}
