import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j >= i; j--) {
                System.out.print(j);
            }
            for (int k = 1; k < i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }

        scanner.close();
    }
}