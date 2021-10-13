
/**
 * Here I am using individual imports just to know what are the things we are importing in
 * program.
 * You can also just import all the things blindly with *
 * import java.io.*
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter q to exit.");

        // Reading the characters
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}

// Output :-
// Enter q to exit.
// 123abcq
// 1
// 2
// 3
// a
// b
// c
// q