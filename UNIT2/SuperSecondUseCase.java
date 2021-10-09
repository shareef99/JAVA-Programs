package UNIT2;

/**
 * super keyword has two use case. 1) Calls the super(parent) class constructor.
 * 2) Access member(attributes) of the super(parent) class. Here we will see
 * second use case
 */

class myClassA {
    int i;
}

class myClassB extends myClassA {
    int i;

    myClassB(int a, int b) {
        super.i = a; // accessing i of myClassA with super keyword
        i = b; // i of myClassB
    }

    void show() {
        System.out.println("I in super class " + super.i);
        System.out.println("I in sub class " + i);
    }
}

public class SuperSecondUseCase {
    public static void main(String[] args) {
        myClassB b = new myClassB(19, 81);
        b.show();
    }
}

// Output :-
// I in super class 19
// I in sub class 81