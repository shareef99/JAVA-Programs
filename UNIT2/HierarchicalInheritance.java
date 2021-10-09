package UNIT2;

class ClassA {
    void showA() {
        System.out.println("Show method of A class");
    }
}

class ClassB extends ClassA {
    void showB() {
        System.out.println("Show method of B class");
    }
}

class ClassC extends ClassA {
    void showC() {
        System.out.println("Show method of C class");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        ClassB B = new ClassB();
        ClassC C = new ClassC();
        B.showB();
        B.showA();
        C.showC();
        C.showA();
    }
}

// Output :-
// Show method of B class
// Show method of A class
// Show method of C class
// Show method of A class