package UNIT3;

public class UncaughtException {
    public static void main(String[] args) {
        int data = 50 / 0;
        System.out.println("Rest of the code");
    }
}

// Output:-
// Exception in thread "main" java.lang.ArithmeticException: / by zero