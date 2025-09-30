package ParallelAndConcurrent.MutualExclusion;

/**
 * Two shoppers adding items to a shared notepad
 */

class Shopper extends Thread {

    static int garlicCount = 0;   //static so that it's the same value for all the threads

    public void run() {
        for (int i=0; i<10_000_000; i++)   //make it big number so we can see the race condition in action
            garlicCount++;
    }
}

public class DataRaceDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread barron = new Shopper();
        Thread olivia = new Shopper();
        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        System.out.println("We should buy " + Shopper.garlicCount + " garlic.");
    }
}