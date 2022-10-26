import java.util.ArrayList;
import java.util.Comparator;


import StreamcAPI.TheChildIsAlreadyAnAdult;

public class HW_12_Lambda_Stream {
    public static void main(String[] args) {
        Kid kidd = new Kid(10, 100, "Sasha");
        TheChildIsAlreadyAnAdult<Kid, Adult> childIsAlreadyAnAdult;
        childIsAlreadyAnAdult = kid-> new Adult(28, 183, "Sasha");
        Adult adult = childIsAlreadyAnAdult.already(kidd);
        System.out.println(adult);

        ArrayList<Adult> adults = new ArrayList<>();
        adults.add(new Adult(32, 185, "Dima"));
        adults.add(new Adult(25, 168, "Katya"));
        adults.add(new Adult(29, 171, "Tanya"));
        adults.add(new Adult(28, 179, "Pasha"));
        String adultStream = adults
                .stream()
                .skip(1)
                .limit(2).max(Comparator.comparing(Adult::getAge))
                .get().getName() + " " + adult.getAge() + " " + adult.getHeight();

        System.out.println(adultStream);

    }
}


