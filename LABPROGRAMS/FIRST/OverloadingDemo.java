package FIRST;

/**
 * Q1. A) Write a Java program to illustrate the concept of class with method
 * overloading.
 */

class A {
    void test() {
        System.out.println("No parameters");
    }

    void test(int a) {
        System.out.println("A: " + a);
    }

    void test(int a, int b) {
        System.out.println("A and B : " + a + " " + b);
    }

}

public class OverloadingDemo {
    public static void main(String[] args) {
        A obj = new A();
        obj.test();
        obj.test(1);
        obj.test(1, 2);
    }
}

// Output :-
// No parameters
// A: 1
// A and B : 1 2
