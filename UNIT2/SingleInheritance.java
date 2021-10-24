class A {
    public void showA() {
        System.out.println("show method of A class");
    }
}

class B extends A {
    public void showB() {
        System.out.println("show method of B class");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        B b = new B();
        b.showA(); // Inherited method
        b.showB();
    }
}

// Output:-
// show method of A class
// show method of B class