public class Bird {
    public static void main(String[] args) {
Golyb golyb= new Golyb();
Vorona vorona = new Vorona();
golyb.fly();
System.out.println("I have" + golyb.color);
vorona.fly();
    System.out.println("I have" + Vorona.color);
    }
    public void fly (){

    }

}
class Golyb extends Bird{
    public static String color = " gray color";
    public void fly(){
        System.out.println(" I fly fast" );
    }


}

class Vorona extends Bird{
    public static String color = "black color";
    public void fly(){
        System.out.println(" I fly slow");
    }

}
