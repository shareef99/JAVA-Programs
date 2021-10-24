package SIXTH;

/**
 * Q6) B) Write a Java program to demonstrate the Interfaces & Abstract Classes.
 * 
 * Interface Example.
 */

interface Callback {
    void callback(int para);
}

class Client implements Callback {
    public void callback(int para) {
        System.out.println(para);
    }

    void show() {
        System.out.println("Show method");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(10);
    }
}

// Output :-
// 10
