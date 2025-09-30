package ParallelAndConcurrent.MutualExclusion; /**
 * Two shoppers adding items to a shared notepad
 */

import java.util.concurrent.locks.*;    //this is the package

class Shopper2 extends Thread {

    static int garlicCount = 0;
    static Lock pencil = new ReentrantLock();   //this is a locker object

    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println("garlicCount: " + garlicCount + " from " + Thread.currentThread().getName() + " prespective");

            pencil.lock();   //lock the action that is important for you
            garlicCount++;
            pencil.unlock();  //unlock after making the action so that other threads can use it
            System.out.println(Thread.currentThread().getName() + " is thinking.");

            System.out.println("garlicCount: " + garlicCount + " from " + Thread.currentThread().getName() + " prespective");


            try {
                Thread.sleep(500);
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

public class MutualExclusionDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread barron = new Shopper2();
        Thread olivia = new Shopper2();
        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        System.out.println("We should buy " + Shopper2.garlicCount + " garlic.");
    }
}