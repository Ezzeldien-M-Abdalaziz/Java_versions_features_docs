package ParallelAndConcurrent.MutualExclusion;

/**
 * Two shoppers adding items to a shared notepad
 */

class Shopper5 extends Thread {

    static Integer garlicCount = 0;

    public void run() {
        for (int i=0; i<10_000_000; i++)
            synchronized (this) {
                garlicCount++;
            }
    }
}

public class SynchronizedStatementDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread barron = new Shopper5();
        Thread olivia = new Shopper5();
        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        System.out.println("We should buy " + Shopper5.garlicCount + " garlic.");
    }
}