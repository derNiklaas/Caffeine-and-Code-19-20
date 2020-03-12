package de.derniklaas.cnc;

public class Baumgroeße {
    public static class BinaryIntTree {
        private BinaryIntTree leftChild;
        private BinaryIntTree rightChild;
        private int value;
        private int count = 0;

        public int sizeDistinct() {
            int size = 0;
            if (count != 0) size++;
            if (leftChild != null) size += leftChild.sizeDistinct();
            if (rightChild != null) size += rightChild.sizeDistinct();
            return size;
        }

        public int size() {
            int size = count;
            if (leftChild != null) size += leftChild.size();
            if (rightChild != null) size += rightChild.size();
            return size;
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
        BinaryIntTree root = new BinaryIntTree();
        int[] in = {1, 2, 7, 519, 1, 6919, 6918, 1, 3, 7, 992, 91, 598132, 69123, 80, -12, 96, 5, 44, 32, 8783,
                98912, 193081, 3295, 37, 378491, 9098432, 293801, 1783, 8028, 193276, 874, 8295, 1,
                191, 9, 129, 5932691, 9127, 291, 481, 992, 195, 9865, 01, 985, 3928, 3875, 98,
                891, 598097, 28, 1749, 28471, 8571, 68737, 683, 173, 6, 6, 381, 385, 985, 871, 598091,
                185, 859, 2985870, 18274, 27579, 27491, 59271, 928, 2840, 189, 9969, 18782, 89712,
                9812, 89120, 309, 71239, 769, 3784, 69271, 27935, 2981789, 88, 172784, 198297,
                891, 85, 8, 65, 18474, 28, 891, 689123, 893, 9694, 8091823, 8095, 891, 598, 9,
                19809, 97, 1975, 801, 972, 871235, 9712, 69872, 713, 609829, 38, 81987, 582, 9883, 1892,
                1892, 10985, 8, 16728, 69371, 397, 0703, 19275, 29173, 5960157, 2185091, 508183, 21087};

        for (int i : in) root.add(i);
        System.out.format("S:%d - D:%d\n", root.size(), root.sizeDistinct());
    }
}

