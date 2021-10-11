package UNIT3;

// Under constructions

public class ThrowArithmeticException {

    public static void main(String[] args) {
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
            throw e;
        }
    }
}
