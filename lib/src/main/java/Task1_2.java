public class Task1_2 {
    public static void main(String[] args) {
        // Task1
        int[] massive = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = 0; i < massive.length; i++)
            System.out.print(massive[i] + " ");

        for (int i = 0; i < massive.length; i++)
            System.out.println(massive[i] + "\n");

        // Task 2
        int a = 0;

        for (int i = 1; i <= 99; i++)
            if (i % 2 != 0) a++;
        int[] massive2 = new int[a];

        for (int i = 1, b = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                massive2[b] = i;

                System.out.print(massive2[b] + " ");
                b++;

            }
        }
        System.out.println("\n");
        for (int i = massive2.length - 1; i >= 0; i--) {
            System.out.print(massive2[i] + " ");
        }

    }
}






