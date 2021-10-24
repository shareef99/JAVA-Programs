/**
 * Q3. Write a Java program to illustrate the concept of Single level and Multi
 * level Inheritance. (a) Single Level Inheritance
 */

class SuperClass {
    void showA() {
        System.out.println("Show method of A");
    }
}

class SubClass extends SuperClass {
    void showB() {
        System.out.println("Show method of B");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.showA();
        obj.showB();
    }
}

// Output :-
// show method of A class
// show method of B class