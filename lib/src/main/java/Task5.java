import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] massive5 = new int[12];
        int max = 0;
        int index = 0;
        for (int i = 0; i < massive5.length; i++) {
            Random random = new Random();
            int randNumb = random.nextInt(15);
            massive5[i] = randNumb;
            if (massive5[i] >= max) {
                max = massive5[i];
                index = i;
            }
            System.out.print(massive5[i] + " ");
        }
        System.out.println("\n" + max + " " + index);
    }
}
