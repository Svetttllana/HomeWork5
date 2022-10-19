import java.util.Arrays;
import java.util.Random;

public class HW_10 {
    public static void task1() {

        int[][] massive = new int[][]{{12, 13, 14}, {15, 16, 17}};
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                System.out.println(massive[i][j]);
            }

        }
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
