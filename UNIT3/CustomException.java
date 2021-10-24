/**
 * Q4) Write a program for creating and using user-defined exceptions.
 */

class GreaterThanTen extends Exception {
    public String toString() {
        return "Number is greater than 10";
    }
}

public class CustomException {
    static void compute(int a) throws GreaterThanTen {
        System.out.println("Given number: " + a);

        if (a > 10) {
            throw new GreaterThanTen();
        }
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (GreaterThanTen e) {
            System.out.println(e);
        }
    }
}

// Output :-
// Given number: 1
// Given number: 20
// Number is greater than 10