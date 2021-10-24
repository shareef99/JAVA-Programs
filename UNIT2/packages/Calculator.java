package packages;

/**
 * Q4) Explain creating and using packages in Java with example program.
 * 
 * Packages are created in different file and used in different file.
 * 
 * Create a folder with the name packages then
 * 
 * Create A file with the name "Calculator.java" then we will use this package
 * in another file with name "UsingCalculatorPackage.java"
 * 
 */

// Inside Calculator.java file

public class Calculator {
    /**
     * Add method is define here, We can use this method in this file and as well as
     * the file which will import Calculator file
     */

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        Calculator obj = new Calculator();
        int result = obj.add(10, 20);
        System.out.println(result);
    }

}

/**
 * Create a new file with the name UsingCalculatorPackage.java first import the
 * package then you can use add method which is define in calculator file
 * 
 * You can find "UsingCalculatorPackage.java" file in UNIT2 folder
 */