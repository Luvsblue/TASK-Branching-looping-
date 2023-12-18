import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number > 0) {
            System.out.println("The number is not a negative.");
        } else {
            System.out.println("The number is niether negative nor positive.");
        }

        scanner.close();
    }
}