package UNIT3;

/**
 * Q2) Illustrate with an example the throw statement by manually throwing an
 * arithmetic exception.
 */

public class CaughtException {
    public static void main(String[] args) {
        try {
            int data = 50 / 0;
            System.out.println("Rest of the code in try block");
        } catch (ArithmeticException e) {
            System.out.println("You are trying to divide by zero");
        }
        System.out.println("Rest of the code");
    }
}

// Output :-
// You are trying to divide by zero
// Rest of the code
