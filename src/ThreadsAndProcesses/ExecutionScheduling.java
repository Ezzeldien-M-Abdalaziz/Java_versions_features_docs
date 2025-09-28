package ThreadsAndProcesses;

/**
 * Two threads chopping vegetables
 */

class VegetableChopper extends Thread{

    public int vegetable_count = 0;
    public static boolean chopping = true;

    public VegetableChopper(String name) {
        this.setName(name);
    }

    public void run() {   //overwrite the run method in the thread interface
        while(chopping) {
            System.out.println(this.getName() + " chopped a vegetable!");
            vegetable_count++;
        }
    }
}

public class ExecutionScheduling {
    public static void main(String[] args) throws InterruptedException {
        VegetableChopper barron = new VegetableChopper("Barron");
        VegetableChopper olivia = new VegetableChopper("Olivia");

        barron.start();                    // Barron start chopping  // a new thread is created → runs barron.run()
        olivia.start();                    // Olivia start chopping   // another new thread → runs olivia.run()
        Thread.sleep(1000);          // continue chopping for 1 second
        VegetableChopper.chopping = false; // stop chopping

        /*
        After 1 second, you set VegetableChopper.chopping = false;

        Both chopping threads eventually stop.

        By calling join(), you make sure main thread waits for both Barron and Olivia to finish chopping before printing their counts.

        Otherwise, main might print results before they stop, giving incomplete or unpredictable results.
         */
        barron.join();
        olivia.join();
        System.out.format("Barron chopped %d vegetables.\n", barron.vegetable_count);
        System.out.format("Olivia chopped %d vegetables.\n", olivia.vegetable_count);
    }
}