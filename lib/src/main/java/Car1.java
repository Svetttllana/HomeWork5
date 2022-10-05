public class Car1 {
   public static void main(String[] args) {
       Car2 car = new Car2(new SpinTheWheels());
       Car2.drive();
       Car2.drive();
        }
    }

 interface Wheels{
   void theWheelsAreSpinning();
    }
class SpinTheWheels implements Wheels{

   public void theWheelsAreSpinning() {
      System.out.println("The wheels are spinning");
     }
  }
class Car2{
   static Wheels wheels;
     Car2(Wheels wheels){
       this.wheels = wheels;
  }
  public static void drive(){
   wheels.theWheelsAreSpinning();
    }
}

