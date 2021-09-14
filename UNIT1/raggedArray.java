package UNIT1;

public class raggedArray {
    public static void main(String[] args) {
        // Creating two dimensional array.
        int twoDArray[][] = new int[4][];
        // Assigning nested array at specific index.
        twoDArray[0] = new int[1];
        twoDArray[1] = new int[2];
        twoDArray[2] = new int[3];
        twoDArray[3] = new int[4];

        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                // Filling the values of two dimensional Array
                twoDArray[i][j] = k;
                k++;
            }
        }

        // Printing the values of two dimensional Array
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
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
// 0
// 1 2
// 3 4 5
// 6 7 8 9