package UNIT2;

interface SuperClass1 {
    void show1();
}

interface SuperClass2 {
    void show2();
}

public class MultipleInheritance implements SuperClass1, SuperClass2 {

    public void show1() {
        System.out.println("Show 1");
    }

    public void show2() {
        System.out.println("Show 2");
    }

    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.show1();
        obj.show2();
    }
}

// Output :-
// Show 1
// Show 2