// This is a practice file.

class A implements Runnable {
    A() {
        Thread t = new Thread(this, "Thread Name");
        System.out.println(t.getName());
        t.start();
    }

    public void run() {
        System.out.println("Run method");
    }
}

public class Practice {
    public static void main(String[] args) {
        new A();
    }
}
