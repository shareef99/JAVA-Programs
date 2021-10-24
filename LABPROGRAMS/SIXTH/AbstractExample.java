package SIXTH;

/**
 * Q6) B) Write a Java program to demonstrate the Interfaces & Abstract Classes.
 * 
 * Abstract Example
 */

abstract class X {
    abstract void callMe();

    void callMeToo() {
        System.out.println("This is concrete method");
    }
}

class Y extends X {
    void callMe() {
        System.out.println("Y implementation of call me.");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Y y = new Y();
        y.callMe();
        y.callMeToo();
    }
}

// Output :-
// Y implementation of call me.
// This is concrete method