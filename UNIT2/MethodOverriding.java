class SuperClass {
    int i, j;

    SuperClass(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("I and J: " + i + " " + j);
    }
}

class SubClass extends SuperClass {
    int k;

    SubClass(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        System.out.println("K: " + k);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        SubClass subClass = new SubClass(1, 2, 3);
        subClass.show();
    }
}

// Output:-
// K: 3
