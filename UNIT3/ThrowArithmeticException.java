package UNIT3;

/**
 * Q2) Illustrate with an example the throw statement by manually throwing an
 * arithmetic exception.
 */

public class ThrowArithmeticException {

    public static void main(String[] args) {
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }
    }
}

// Output :-
// Arithmetic exception
