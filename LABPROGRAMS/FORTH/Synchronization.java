package FORTH;

/**
 * Q4) B) Write a Java program to illustrate the concept of Thread
 * synchronization.
 */

class CallMe {
    synchronized void call(String msg) {
        System.out.print("[" + msg);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    CallMe target;
    Thread t;

    Caller(CallMe targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        target.call(msg);
    }
}

public class Synchronization {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller obj1 = new Caller(target, "Hello");
        Caller obj2 = new Caller(target, "JAVA");
        Caller obj3 = new Caller(target, "LAB");

        // Wait for a thread to terminate(end)
        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

// Output:
// [Hello]
// [JAVA]
// [LAB]