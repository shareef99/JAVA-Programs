// Q5) Explain the flow of controls in exception handling programs with example.
// Q9) Discuss the exception handling mechanism in Java with example.
// What is an exception?Explain how exceptions are handled in Java with suitable example.

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int c[] = { 1 };
            c[2] = 99;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }
}

// Output :-
// Array index out of bounds