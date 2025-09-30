package ParallelAndConcurrent.MutualExclusion;

/**
 * Two shoppers adding items to a shared notepad
 */

class Shopper4 extends Thread {

    static int garlicCount = 0;

    //here each method use the intrinsic lock that come with the class and this is achieved
    // because of this is a static method, without the static keyword , the synchronized won't work
    private static synchronized void addGarlic() {
        garlicCount++;
    }

    public void run() {
        for (int i=0; i<10_000_000; i++)
            addGarlic();
    }
}

public class SynchronizedMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread barron = new Shopper4();
        Thread olivia = new Shopper4();
        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        System.out.println("We should buy " + Shopper4.garlicCount + " garlic.");
    }
}