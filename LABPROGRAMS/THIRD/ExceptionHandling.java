package THIRD;

/**
 * 3) B) Write a Java program to implement the concept of exception handling.
 */

public class ExceptionHandling {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        try {
            int c[] = { 1 };
            c[2] = 99;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } finally {
            System.out.println("Finally block code.");
        }
    }
}

// Output:
// Array index out of bounds
// Finally block code.