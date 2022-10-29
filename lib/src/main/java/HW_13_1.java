public class HW_13_1 {
    public static void main(String[] args) {
        Tread1 tread1 = new Tread1();
        Tread1_1 tread1_1 = new Tread1_1();

        Thread thread1 = new Thread(tread1);
        thread1.start();

        Thread thread1_1 = new Thread(tread1_1);
        thread1_1.start();

    }
}


class Tread1 extends Thread {
    @Override
    public void run() {
        System.out.println("the first potok");
    }

}

class Tread1_1 extends Thread {
    @Override
    public void run() {
        try {
            sleep(5000);

        } catch (Exception e) {
        }
        long start = System.currentTimeMillis();
        Thread thread2 = Thread.currentThread();
        System.out.println("the second potok" + thread2);
    }
}