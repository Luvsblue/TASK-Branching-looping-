import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        int number = 876;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("The reversed number is: " + reversedNumber);
    }
}
