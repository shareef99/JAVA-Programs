package UNIT3;

public class PriorityThread extends Thread {

    public void run() {
        System.out.println("Inside run method");
    }

    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        PriorityThread t3 = new PriorityThread();

        System.out.println("t1 Thread priority : " + t1.getPriority());
        System.out.println("t2 Thread priority : " + t2.getPriority());
        System.out.println("t3 Thread priority : " + t3.getPriority());

        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(9);

        System.out.println("t1 Thread priority : " + t1.getPriority());
        System.out.println("t2 Thread priority : " + t2.getPriority());
        System.out.println("t3 Thread priority : " + t3.getPriority());

        // Main thread
        System.out.println("Main thread priority " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(9);
        System.out.println("Main thread priority " + Thread.currentThread().getPriority());

    }

}
