package EIGHT;

/**
 * Q8. Write a Java program to illustrate the concept of Single level and Multi
 * level Inheritance. (a) Single Level Inheritance
 */

class A {
    void showA() {
        System.out.println("Show method of A");
    }
}

class B extends A {
    void showB() {
        System.out.println("Show method of B");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.showA();
        obj.showB();
    }
}

// Output :-
// show method of A class
// show method of B class
