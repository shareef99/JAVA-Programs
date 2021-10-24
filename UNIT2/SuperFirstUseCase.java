/**
 * super keyword has two use case. 1) Calls the super(parent) class constructor.
 * 2) Access member(attributes) of the super(parent) class. Here we will see
 * first use case
 */

class myClass {
    myClass() {
        System.out.println("My class constructor called");
    }
}

class mySubClass extends myClass {
    mySubClass() {
        super(); // Calling the super(parent) class constructor.
        System.out.println("My sub class constructor called");
    }
}

public class SuperFirstUseCase {
    public static void main(String[] args) {
        // Calling constructor of mySubClass
        // Notice the output will print the content of superclass also because of super
        new mySubClass();
    }
}

// Output :-
// My class constructor called
// My sub class constructor called