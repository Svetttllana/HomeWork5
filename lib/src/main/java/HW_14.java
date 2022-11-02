
public class HW_14 {
    public static void main(String[] args) {
        Store store = new Store();
        Produser produser = new Produser(store);
        Consumer consumer = new Consumer(store);
        new Thread(produser).start();
        new Thread(consumer).start();
    }
}

class Produser implements Runnable {
    Store store;

    public Produser(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 2; i++) {
            store.put();
        }

    }
}


class Consumer implements Runnable {
    Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 2; i++) {
            store.get();
        }

    }
}

class Store {
    int product = 0;

    synchronized void get() {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("interrupt ");
            }
        }
        product--;

        System.out.println("Consumer bought 1 product: ");
        System.out.println("product available: " + product);
        notify();

    }

    synchronized void put() {
        while (product >= 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("interrupt ");
            }
        }
        try {
            System.out.println("sleeping");
            Thread.sleep(300);
        } catch (InterruptedException e) {
            System.out.println("interrupt ");
        }
        product++;
        System.out.println("Produser made 1 product ");
        System.out.println("product available " + product);
        notify();

    }
}
