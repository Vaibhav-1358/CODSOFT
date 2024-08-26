package codsoft4;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conversion rates
        double usdToInr = 83.0;
        double eurToInr = 90.0;
        double usdToEur = 0.85;

        // Display options
        System.out.println("Currency Converter");
        System.out.println("1: USD to INR");
        System.out.println("2: INR to USD");
        System.out.println("3: EUR to INR");
        System.out.println("4: INR to EUR");
        System.out.println("5: USD to EUR");
        System.out.println("6: EUR to USD");
        System.out.print("Choose the conversion option: ");
        int choice = scanner.nextInt();

        // Amount to be converted
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        double convertedAmount = 0;

        // Conversion logic
        switch (choice) {
            case 1:
                convertedAmount = amount * usdToInr;
                System.out.println("USD " + amount + " = INR " + convertedAmount);
                break;
            case 2:
                convertedAmount = amount / usdToInr;
                System.out.println("INR " + amount + " = USD " + convertedAmount);
                break;
            case 3:
                convertedAmount = amount * eurToInr;
                System.out.println("EUR " + amount + " = INR " + convertedAmount);
                break;
            case 4:
                convertedAmount = amount / eurToInr;
                System.out.println("INR " + amount + " = EUR " + convertedAmount);
                break;
            case 5:
                convertedAmount = amount * usdToEur;
                System.out.println("USD " + amount + " = EUR " + convertedAmount);
                break;
            case 6:
                convertedAmount = amount / usdToEur;
                System.out.println("EUR " + amount + " = USD " + convertedAmount);
                break;
            default:
                System.out.println("Invalid option selected.");
                break;
        }

        scanner.close();
    }
}
