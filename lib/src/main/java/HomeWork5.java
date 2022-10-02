public class HomeWork5 {
    public static void main(String[] args) {
        Phone phone1 = new Phone(336646848, 100, "samsung", "Syzi");
        Phone phone2 = new Phone(297021154, 200, "iphone", "Jon");
        Phone phone3 = new Phone(298782121, 150, "xiaomi", "Mashaa");


        System.out.println(phone1.number + phone1.model + phone1.weight);
        System.out.println(phone2.number + phone2.model + phone2.weight);
        System.out.println(phone3.number + phone3.model + phone3.weight);

        phone1.receiveCall();
        phone1.getNumber();
        phone2.receiveCall();
        phone2.getNumber();
        phone3.receiveCall();
        phone3.getNumber();

        phone1.receiveCall(phone1.number, phone1.name);
        phone2.receiveCall(phone2.number, phone2.name);
        phone3.receiveCall(phone3.number, phone3.name);

        phone1.sendMassage(phone1.number);
        phone2.sendMassage(phone2.number);
        phone3.sendMassage(phone3.number);
            }
        }


class Phone{
    public int number;
    public int weight;
    public String model;
    public String name;


    public Phone( int number, int weight ,String model, String name ){
        this.number=number;
        this.weight=weight;
        this.model=model;
        this.name=name;

        Phone phone = new Phone(1, 23);

    }
    public Phone(int number,int weight){
        this.number=number;
        this.weight=weight;
    }
    public Phone (){

    }

    public void receiveCall() {
        System.out.println( "Calls " + name);
    }
    public void receiveCall(int number, String name) {
        System.out.println( number + name);
    }
    public void getNumber(){
        System.out.println(number);
    }
public void  sendMassage(int number){
        System.out.println("You won a car" + number);
}
}


