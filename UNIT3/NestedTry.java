package UNIT3;

public class NestedTry {
    public static void main(String[] args) {
        try {
            int a = 2;
            int b = 42 / a;
            System.out.println("A = " + a);
            try {
                if (a == 1) {
                    a = a / (a - a);
                }
                if (a == 2) {
                    int c[] = { 1 };
                    c[2] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds");
            }
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero");
        }
    }
}

//
