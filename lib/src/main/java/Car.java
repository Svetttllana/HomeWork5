import java.util.Random;

public class Car {
    public static void main(String[] args)  {
        Car car1 = new Car("Lamborghini", 150000, 200);
        Car car2 = new Car("Ferrari", 200000, 250);
        try {
            car1.start();
        } catch (EvenNumberException e) {
            e.printStackTrace();
        }
        try {
            car2.start();
        } catch (EvenNumberException e) {
            e.printStackTrace();
        }
    }

    String brend;
    int speed;
    int price;

    public Car(String brend, int price, int speed) {
        this.brend = brend;
        this.price= price;
        this.speed= speed;
    }
    void start() throws EvenNumberException {
        Random random = new Random();
        int a = random.nextInt(20);
        if(a%2==0) {
            System.out.println(" sorry, there was an error with the car" + brend);
        }else {
            System.out.println("The car" + brend+ "started up");
        }
    }
    public Car(){

    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend=brend;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed=speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price=price;
    }
}