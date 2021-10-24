public class forVSforEach {
    public static void main(String[] args) {
        // Adding N numbers with regular for loop.
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int sum = 0;
        int sumWithForEach = 0;
        // Regular For loop
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum is: " + sum);

        // For Each loop
        for (int x : numbers) {
            sumWithForEach += x;
        }
        System.out.println("Sum is: " + sumWithForEach);

    }
}

// Output: -
// Sum is: 45
// Sum is: 45