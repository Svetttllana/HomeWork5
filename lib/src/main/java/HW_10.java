import java.util.Arrays;
import java.util.Random;

public class HW_10 {
    public static void task1() {

        int[][] massive = new int[][]{{12, 13, 14}, {15, 16, 17}};
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                System.out.println(massive[i][j] + " ");
            }
        }
        System.out.println();
    }


    public static void task2() {
        int[][][] massive1 = {
                {
                        {12,},
                        {15, 16, 17},
                },
                {

                        {27, 32}}
        };

        for (int i = 0; i < massive1.length; i++) {
            for (int j = 0; j < massive1[i].length; j++) {
                for (int k = 0; k < massive1[i][j].length; k++) {

                    System.out.println(massive1[i][j][k] + " ");

                }
                System.out.println();
            }

        }

        for (int i = 0; i < massive1.length; i++) {
            for (int j = 0; j < massive1[i].length; j++) {
                for (int k = 0; k < massive1[i][j].length; k++) {


                    System.out.print(massive1[i][j][k] + " ");
                }

            }


        }
        System.out.println();
    }

    public static void task3() {
        System.out.println();
        int[][] massive3 = new int[][]{{1, 23, 12, 5}, {99, 40, 50, 20, 19}};
        boolean isSorted = false;
        int buf;

        while (isSorted == false) {
            isSorted = true;
            for (int i = 0; i < massive3.length; i++) {
                for (int j = 0; j < massive3[i].length - 1; j++) {
                    if (i == 0) {
                        if (massive3[i][j] > massive3[i][j + 1]) {
                            isSorted = false;
                            buf = massive3[i][j];
                            massive3[i][j] = massive3[i][j + 1];
                            massive3[i][j + 1] = buf;
                        }
                    }

                    if (i == 1) {
                        if (massive3[i][j] < massive3[i][j + 1]) {
                            isSorted = false;
                            buf = massive3[i][j];
                            massive3[i][j] = massive3[i][j + 1];
                            massive3[i][j + 1] = buf;
                        }
                    }

                }
            }
        }
        for (int i = 0; i < massive3.length; i++) {
            for (int j = 0; j < massive3[i].length; j++) {
                System.out.println(massive3[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void task4() {
        Random random = new Random();

        int[][][] massive4 = new int[5][5][5];

        for (int i = 0; i < massive4.length; i++) {
            for (int j = 0; j < massive4[i].length; j++) {
                for (int k = 0; k < massive4[j].length; k++) {
                    massive4[i][j][k] = random.nextInt(15);


                }
            }

        }
        System.out.println(Arrays.deepToString(massive4));
    }
}
