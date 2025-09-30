package ParallelAndConcurrent.MutualExclusion;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Two shoppers adding items to a shared notepad
 */

class Shopper3 extends Thread {

    static AtomicInteger garlicCount = new AtomicInteger(0);   //instead of using normal int

    public void run() {
        for (int i=0; i<10_000_000; i++)
            garlicCount.incrementAndGet();   //instead of garlicCount++
    }
}

public class AtomicVariable {
    public static void main(String[] args) throws InterruptedException {
        Thread barron = new Shopper3();
        Thread olivia = new Shopper3();
        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        System.out.println("We should buy " + Shopper3.garlicCount + " garlic.");
    }
}