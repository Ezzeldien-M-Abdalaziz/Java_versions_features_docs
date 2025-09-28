package ThreadsAndProcesses;

/**
 * Two threads cooking soup
 */

class ChefOlivia extends Thread {
    public void run() {
        System.out.println("Olivia started & waiting for sausage to thaw...");  //4
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After sleep 3 seconds : Olivia is done cutting sausage.");  //6
    }
}

//Why does this happen?  3 and 4 prints order
//
//start() does not block the main thread. It just tells the JVM:
//“Please create a new thread and call its run() when you can.”
//
//Whether the OS scheduler actually runs Olivia’s thread before or after Barron continues is not guaranteed.
//
//So:
//
//Sometimes Olivia runs right away → step 3 comes before step 4.
//
//Sometimes the JVM lets Barron run a bit longer → step 4 comes before step 3.
//
//This is normal in multithreading: you can’t predict exact interleaving unless you explicitly synchronize.

public class ThreadLifeCycleDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Barron started & requesting Olivia's help."); //1
        Thread olivia = new ChefOlivia();

        System.out.println("Barron tells Olivia to start.");  //2
        olivia.start();  // prints the first message the wait 3 seconds and print the second message


        System.out.println("Barron continues cooking soup."); //3
        Thread.sleep(500);

        System.out.println("Barron patiently waits for Olivia to finish and join...");  //5
        olivia.join();

        System.out.println("Barron and Olivia are both done!");  //7
    }
}