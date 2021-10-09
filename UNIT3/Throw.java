package UNIT3;

public class Throw {

    static void demoProgram() {
        try {
            throw new NullPointerException("Demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside demo program.");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoProgram();
        } catch (NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
}

// Output :-
// Caught inside demo program.
// Recaught: java.lang.NullPointerException: Demo