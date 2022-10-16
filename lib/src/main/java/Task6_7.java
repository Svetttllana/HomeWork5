import java.util.Arrays;

public class Task6_7 {
    public static void main(String[] args) {
        //Bubble sort
        int massive6[] = {21, 71, 55, 20, 29, 5, 7, 10, 19, 18, 23, 70};
        boolean isSorted = false;
        int buffer;

        while (isSorted == false) {
            isSorted = true;
            for (int i = 0; i < massive6.length - 1; i++) {
                if (massive6[i] > massive6[i + 1]) {
                    isSorted = false;

                    buffer = massive6[i];
                    massive6[i] = massive6[i + 1];
                    massive6[i + 1] = buffer;
                }
            }

        }
        System.out.print(Arrays.toString(massive6) + " ");


        //Insertion sort
        int massive7[] = {88, 39, 22, 44, 65, 1, 12, 54, 67, 20, 2, 9, 3};
        for (int i = 1; i < massive7.length; i++) {
            int current = massive7[i];
            int newValue = i - 1;
            while (newValue >= 0 && current < massive7[newValue]) {
                massive7[newValue + 1] = massive7[newValue];
                newValue--;

            }
            massive7[newValue + 1] = current;

        }
        System.out.println("\n" + Arrays.toString(massive7) + " ");
    }
}
