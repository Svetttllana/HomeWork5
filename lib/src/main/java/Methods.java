public class Methods {
}

class Thread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Start Thread");
    }
}

class Runble1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Start Runable");
    }
}