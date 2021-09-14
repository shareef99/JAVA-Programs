package UNIT1;

class Overload {
    void test() {
        System.out.println("No parameters");
    }

    void test(int a) {
        System.out.println("A " + a);
    }

    void test(int a, int b) {
        System.out.println("A and B " + a + " " + b);
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.test();
        overload.test(1);
        overload.test(2, 3);
    }
}

// Output: -
// No parameters
// A 1
// A and B 2 3
