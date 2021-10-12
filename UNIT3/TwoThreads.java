package UNIT3;

class ThreadOne extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("ThreadOne: " + i);
        }
    }
}

class ThreadTwo extends Thread {
    public void run() {
        for (int i = 0; i <= 200; i++) {
            System.out.println("ThreadTwo: " + i);
        }
    }
}

public class TwoThreads {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        t1.start();
        t2.start();
    }
}
