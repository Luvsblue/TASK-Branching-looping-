import java.util.Scanner;

public class PurchaseAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        double discountPercentage = 0;

        if (purchaseAmount < 500) {
            discountPercentage = 0;
        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            discountPercentage = 10;
        } else if (purchaseAmount > 1000) {
            discountPercentage = 20;
        }

        double discount = purchaseAmount * (discountPercentage / 100);
        double payableAmount = purchaseAmount - discount;

        System.out.println("Final payable amount after applying discount: " + payableAmount);

        scanner.close();
    }
}
