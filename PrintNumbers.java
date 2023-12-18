import java.util.Scanner;
public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        for (int i = 10; i <= 50; i++) {
            System.out.println(i);
        }
    }
}
