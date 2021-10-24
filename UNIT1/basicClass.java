class Box1 {
    int w;
    int h;
    int d;
}

public class basicClass {
    public static void main(String[] args) {
        Box1 box = new Box1();
        // Assign values to box.
        box.w = 1;
        box.h = 2;
        box.d = 3;
        double vol = box.w * box.d * box.h;
        System.out.println("Volume of box is " + vol);
    }
}

// Output:-
// Volume of box is 6.0