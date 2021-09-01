import java.util.Scanner;

public class PrimeNumberFromConsole {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner readNumber = new Scanner(System.in);
        int number;
        System.out.println("Enter number: ");
        number = readNumber.nextInt();
        if(isPrime(number))
            System.out.println(number + " is prime");
        else System.out.println( number + " is not prime");
    }
}