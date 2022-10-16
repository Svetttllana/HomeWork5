public class Task3 {
    public static void main(String[] args) {
        //Task3
        int a = 0;
        int[] massive3 = new int[]{13, 22, 16, 7, 9, 45, 67, 9, 87, 88, 23, 12, 3};
        for (int i = 0; i < massive3.length; i++) {
            System.out.print(massive3[i] + " ");

            if (massive3[i] % 2 == 0) {
                a++;

            }
        }
        System.out.println("\n" + a);
    }
}

