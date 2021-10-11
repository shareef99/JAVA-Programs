package UNIT3;

/**
 * Q7) Explain isAlive() and join() methods with an example. (isAlive Method)
 */

public class isAlive extends Thread {

    public void run() {
        System.out.println("Starting Thread ");

        try {
            Thread.sleep(300);
        } catch (InterruptedException ie) {
            System.out.println("Interrupted");
        }
        System.out.println("Thread is ending...");
    }

    public static void main(String[] args) {

        isAlive c1 = new isAlive();
        isAlive c2 = new isAlive();

        // Starting threads
        c1.start();
        c2.start();

        // Checking whether thread is alive or not
        // Returning boolean true if alive else false
        System.out.println(c1.isAlive());
        System.out.println(c2.isAlive());
    }
}

// Output:-
// true
// Starting Thread
// Starting Thread
// true
// Thread is ending...
// Thread is ending...