
/**
 * Importing Calculator package
 */

import packages.Calculator; // You don't have to write UNIT2 in exam

public class UsingCalculatorPackage {
    public static void main(String[] args) {
        // Calculator Class is not defined here but still we can use it because we
        // imported it from packages
        Calculator obj = new Calculator();
        int result = obj.add(10, 20);
        System.out.println(result);
    }

}

// Output :-
// 30
