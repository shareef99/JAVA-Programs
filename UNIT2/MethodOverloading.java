class ParentClass {
    int i, j;

    ParentClass(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("I and J: " + i + " " + j);
    }
}

class ChildClass extends ParentClass {
    int k;

    ChildClass(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        ChildClass subClass = new ChildClass(1, 2, 3);
        subClass.show("This is k: ");
        subClass.show();
    }
}

// Output:-
// This is k: 3
// I and J: 1 2