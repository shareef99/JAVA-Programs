package UNIT1;

public class twoDArray {
    public static void main(String[] args) {
        // Creating two dimensional array with all zeros in it.
        int twoDArray[][] = new int[4][5];
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                // Filling the values of two dimensional Array
                twoDArray[i][j] = k;
                k++;
            }
        }

        // Printing the values of two dimensional Array
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                /**
                 * print means print in line and println means go to new line after printing
                 * Both are correct.
                 */
                System.out.print(twoDArray[i][j] + " ");
            }
            // This line of code will take us to new line in the output terminal
            System.out.println();
        }
    }
}

// Output:-
// 0 1 2 3 4
// 5 6 7 8 9
// 10 11 12 13 14
// 15 16 17 18 19
