package UNIT3;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            int a = 1;
            System.out.println("A = " + a);
            int b = 42 / a;
            int c[] = { 5 };
            c[2] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Divided by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound");
        }
        System.out.println("Rest of the code");
    }
}

// Output:-
// If a === 0
// A = 0
// Divided by zero
// Rest of the code
//
// If a === 1
// A = 1
// Array index out of bound
// Rest of the code