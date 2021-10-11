package UNIT3;

/**
 * Q7) Explain isAlive() and join() methods with an example. (Join Method)
 */

public class joinMethod extends Thread {

    public void run() {
        System.out.println("Starting Thread ");

        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
            System.out.println("Interrupted");
        }
        System.out.println("Ending Thread ");
    }

    public static void main(String[] args) {

        joinMethod c1 = new joinMethod();
        joinMethod c2 = new joinMethod();

        // Starting first thread
        c1.start();

        try {
            // Waiting for first thread to finish
            c1.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        // Starting thread 2
        c2.start();
    }
}

// Output :-
// Starting Thread
// Ending Thread
// Starting Thread
// Ending Thread