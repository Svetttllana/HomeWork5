public class CreditCard  {
    public static void main(String[] args) {
        CreditCard creditCard1= new CreditCard(12345678, 4567, 765);
        CreditCard creditCard2= new CreditCard(987654321, 3456, 978);
        CreditCard creditCard3 = new CreditCard(456789123,4567, 987);
        addTheAmount(creditCard1.amountOnAccount, creditCard1.dobavitAndOtnyatNaSchet );
        addTheAmount(creditCard2.amountOnAccount, creditCard2.dobavitAndOtnyatNaSchet );
        takeAwayAmount(creditCard3.amountOnAccount, creditCard3.dobavitAndOtnyatNaSchet );
    }

    int accountNumber ;
    int amountOnAccount ;
    int dobavitAndOtnyatNaSchet ;

    public CreditCard( int accountNumber, int amountOnAccount, int dobavitAndOtnyatNaSchet) {
        this.accountNumber = accountNumber;
        this.amountOnAccount= amountOnAccount;
        this.dobavitAndOtnyatNaSchet = dobavitAndOtnyatNaSchet;
    }

    public static int takeAwayAmount (int amountOnAccount, int dobavitAndOtnyatNaSchet) {
        int a = amountOnAccount - dobavitAndOtnyatNaSchet;
        System.out.println(a);
        return a;
    }

    public void Info() {
        System.out.println("Your number"+ accountNumber);
        System.out.println("Your amount on Account is:" + amountOnAccount);
    }


    public static int addTheAmount(int amountOnAccount, int dobavitAndOtnyatNaSchet) {
        int i = amountOnAccount + dobavitAndOtnyatNaSchet;
        System.out.println(i);
        return i;
    }
}
