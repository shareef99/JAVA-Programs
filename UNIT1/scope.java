package UNIT1;

public class scope {
    public static void main(String[] args) {
        // Outer Scope
        int x = 10;
        if (x == 10) {
            // Inner Scope
            int y = 20;
            System.out.println("X and Y: " + x + " " + y);
            x = y * 2;
        }
        System.out.println("X is: " + x);
    }
}
