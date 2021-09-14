package UNIT1;

public class basicMaths {
    public static void main(String[] args) {
        System.out.println("Integer Arithmetic");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
        System.out.println("E = " + e);

        System.out.println("Floating Arithmetic");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - da;
        double de = -dd;
        System.out.println("DA = " + da);
        System.out.println("DB = " + db);
        System.out.println("DC = " + dc);
        System.out.println("DD = " + dd);
        System.out.println("DE = " + de);

        System.out.println("Modulus Operator");
        int x = 42;
        double y = 42.42;
        System.out.println("X mod 10 = " + x % 10);
        System.out.println("Y mod 10 = " + y % 10);

    }
}

// Output
// Integer Arithmetic
// A=2
// B=6
// C=1
// D=-1
// E=1
// Floating Arithmetic
// DA=2.0
// DB=6.0
// DC=1.5
// DD=-0.5
// DE=0.5
// Modulus Operator
// X mod 10=2
// Y mod 10= 2.4200000000000000