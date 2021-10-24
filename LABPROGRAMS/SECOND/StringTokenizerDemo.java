package SECOND;

/**
 * Q2. Write a Java program that reads a line of integers, and displays each
 * integer, and the sum of all the integers ( use StringTokenizer class of
 * java.util)
 */

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Here I am importing methods separately, you can import them all blindly by
 * using 'import java.util.*;'
 */

public class StringTokenizerDemo {
    public static void main(String[] args) {
        int n;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers with one space gap:");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum += n;
        }

        System.out.println("sum of the integers is: " + sum);
        sc.close();
    }
}

// Output :-
// Enter integers with one space gap:
// 1 2 3 4 5
// 1
// 2
// 3
// 4
// 5
// sum of the integers is: 15