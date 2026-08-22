package org.prog.session4;
//TODO: Bubble sort array of random ints (see SortingDemo)
// RU: Сортировка пузырьком
// TIP: while + for
public class HomeWorkArrays {

    public static void main(String[] args) {

        int[][] ints = new int[][]{
                {4, 2, 1},
                {9, 5, 3, 12, 6, 13},
                {8, 10, 7, 11}
        };

        int i = 0;

        while (i < ints.length) {

            for (int j = 1; j < ints[i].length; ) {

                if (j == 0) {
                    j++;
                }

                int currentPot = ints[i][j];
                int prevPot = ints[i][j - 1];

                if (currentPot < prevPot) {

                    ints[i][j] = prevPot;
                    ints[i][j - 1] = currentPot;

                    j--;

                } else {
                    j++;
                }
            }

            i++;
        }

        for (i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.println(ints[i][j]);
            }
        }
    }
}
