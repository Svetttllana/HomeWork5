import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        //Task3
        Random rand = new Random();

        int[] massive3 = new int[15];
        int chetn=0;
        for (int i = 0; i < massive3.length; i++){
            int randomNumber = rand.nextInt(99);
            massive3[i] = randomNumber;
            System.out.print(massive3[i] + " ");
                        if (massive3[i] % 2 == 0) {
                chetn++;

            }
        }
        System.out.println("\n" + chetn);
    }
}

