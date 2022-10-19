import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] massive4 = new int[20];

        for (int i = 0; i < massive4.length; i++) {
            Random rand = new Random();
            int randomNumber = rand.nextInt(20);
            massive4[i] = randomNumber;
            System.out.print(massive4[i] + " ");
        }


//          for (int i = 0; i < massive4.length; i++) {
//
//        }
        for (int i = 0; i < massive4.length; i++) {
            if (massive4[i] % 2 != 0) {

                massive4[i] = 0;
            }
        }
        System.out.println("\n" + Arrays.toString(massive4));
    }
}
