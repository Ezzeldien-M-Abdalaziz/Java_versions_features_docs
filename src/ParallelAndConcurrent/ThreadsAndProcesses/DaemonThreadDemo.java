package ParallelAndConcurrent.ThreadsAndProcesses;

/**
 * Barron finishes cooking while Olivia cleans
 */

class KitchenCleaner extends Thread {
    public void run() {
        while (true) {
            System.out.println("Olivia cleaned the kitchen.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class DaemonThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread olivia = new KitchenCleaner();
        olivia.setDaemon(true);   //set the thread as daemon so that when the main thread finish , this one finish also except the fact that it has an inifinit loop
        olivia.start();

        System.out.println("Barron is cooking...");
        Thread.sleep(600);
        System.out.println("Barron is cooking...");
        Thread.sleep(600);
        System.out.println("Barron is cooking...");
        Thread.sleep(600);
        System.out.println("Barron is done!");
    }
}