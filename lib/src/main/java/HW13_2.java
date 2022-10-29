public class HW13_2 {
    public static void main(String[] args) {
        Thread2 thread2 = new Thread2();
        thread2.start();

        Runble1 runble1 = new Runble1();
        Thread thread1 = new Thread(runble1);
        thread1.start();


        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Start Anonim Runable");
            }
        };
        Thread thread = new Thread(runnable1);
        thread.start();

        Thread thread3 = new Thread() {
            @Override
            public void run() {
                System.out.println("Start Anonim Thread");
            }
        };
        thread3.start();
    }
}


