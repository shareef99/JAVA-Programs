public class breakLabel {
    public static void main(String[] args) {
        outer: for (int i = 0; i < 3; i++) {
            System.out.println("pass " + i);
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break outer;

                }
                System.out.print(j + " ");
            }
        }
        System.out.println("\nLoops completed");
    }
}

// Output:-
// pass 0
// 0 1 2 3 4 5 6 7 8 9
// Loops completed