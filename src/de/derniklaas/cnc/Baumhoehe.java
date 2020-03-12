package de.derniklaas.cnc;

public class Baumhoehe {

    public static class BinaryIntTree {
        private BinaryIntTree leftChild;
        private BinaryIntTree rightChild;
        /* Wert des Knoten */
        private int value;
        /* Anzahl (gleichen) werte im Knoten */
        private int count = 0;

        public int height() {
            if (count == 0) {
                return 0;
            }
            int left = 0;
            int right = 0;
            if (leftChild != null) left = leftChild.height();
            if (rightChild != null) right = rightChild.height();
            return left < right ? right + 1 : left + 1;
        }

        public void add(int i) {
            if (count == 0) {
                value = i;
                count = 1;
            } else if (i < value) {
                if (leftChild == null) {
                    leftChild = new BinaryIntTree();
                }
                leftChild.add(i);
            } else if (i > value) {
                if (rightChild == null) {
                    rightChild = new BinaryIntTree();
                }
                rightChild.add(i);
            } else {
                count++;
            }
        }
    }

    public static void run() {
        BinaryIntTree root1 = new BinaryIntTree();
        BinaryIntTree root2 = new BinaryIntTree();
        BinaryIntTree root3 = new BinaryIntTree();
        BinaryIntTree root4 = new BinaryIntTree();
        int[] in1 = {12, 2, 7, 519, 1, 6919, 6918, 1, 3, 7, 992, 91, 598132, 69123, 80, -12, 96, 5, 44, 32, 8783,
                98912, 193081, 3295, 37, 378491, 9098432, 293801, 1783, 8028, 193276, 874, 8295, 1};
        int[] in2 = {191, 9, 129, 5932691, 9127, 291, 481, 992, 195, 9865, 01, 985, 3928, 3875, 98,
                891, 598097, 28, 1749, 28471, 8571, 68737, 683, 173, 6, 6, 381, 385, 985, 871, 598091,
                185, 859, 2985870, 18274, 27579, 27491, 59271, 928, 2840, 189, 9969, 18782, 89712,
                9812, 89120, 309, 71239, 769, 3784, 69271, 27935, 2981789, 88, 172784, 198297};
        int[] in3 = {891, 85, 8, 65, 18474, 28, 891, 689123, 893, 9694, 8091823, 8095, 891, 598, 9,
                19809, 97, 1975, 801, 972, 871235, 9712, 69872, 713, 609829, 38, 81987, 582, 9883, 1892,
                1892, 10985, 8, 16728, 69371, 397, 0703, 19275, 29173, 5960157, 2185091, 508183, 21087};

        for (int i : in1) root1.add(i);
        for (int i : in2) root2.add(i);
        for (int i : in3) root3.add(i);

        System.out.format("Flag: 1=%d,2=%d,3=%d,4=%d\n", root1.height(),
                root2.height(), root3.height(), root4.height());
    }
}
