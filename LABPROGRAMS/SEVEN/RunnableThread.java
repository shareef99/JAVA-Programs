package SEVEN;

/**
 * Q7) B) Write a Java program to illustrate the concept of threading using
 * Thread Class and Runnable Interface (Runnable Example)
 */

class NewThread implements Runnable {
    NewThread() {
        // Create a new, second thread
        Thread t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start(); // Start the thread
    }

    // This is the entry point for the second thread.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        new NewThread(); // create a new thread
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}

// Output:-
// Child thread: Thread[Demo Thread,5,main]
// Main Thread: 5
// Child Thread: 5
// Child Thread: 4
// Main Thread: 4
// Child Thread: 3
// Child Thread: 2
// Main Thread: 3
// Child Thread: 1
// Exiting child thread.
// Main Thread: 2
// Main Thread: 1
// Main thread exiting.