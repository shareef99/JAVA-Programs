package UNIT1;

class BoxWithMethod {
    int h;
    int w;
    int d;

    int vol() {
        return h * w * d;
    }
}

public class classWithMethod {
    public static void main(String[] args) {
        BoxWithMethod box = new BoxWithMethod();
        // Assign values.
        box.h = 2;
        box.w = 3;
        box.d = 4;
        int vol = box.vol();
        System.out.println("Volume of box is " + vol);
    }
}

// Output:-
// Volume of box is 6.0