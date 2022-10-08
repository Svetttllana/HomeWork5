public class HomeWork7 {
    public static void main(String[] args) {
        Season1 season = Season1.SUMMER;
        season.getDescription();

        switch (season){
            case SUMMER:
                System.out.println("I like summer");
                break;
            case SPRING:
                System.out.println("I like Spring");
                break;
            case WINTER:
                System.out.println("I like Winter");
                break;
            case AUTUM:
                System.out.println("I like Autum");
                break;
        }

        for (Season1 szn: Season1.values()){
            System.out.println(szn.getDescription()+" "+szn.temperature);

        }
    }
}
enum Season1 {
    WINTER(-20), AUTUM(-6), SPRING(8),
    SUMMER(25){

        @Override public String getDescription ()
        {
            return  "Warm season";
        }
    };

    public  String getDescription() {
        return "Cold season";
    }

    public int temperature;
    Season1(int temperature) {
        this.temperature = temperature;
    }
}
