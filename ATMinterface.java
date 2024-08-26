package codsoft3;

import java.util.Scanner;

public class ATMinterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        boolean exit = false;

        while (!exit) {
            System.out.println("\nWelcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Your current balance is: $%.2f%n", balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("$%.2f has been deposited. Your new balance is: $%.2f%n", depositAmount, balance);
                    } else {
                        System.out.println("Invalid deposit amount. Please enter a positive number.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.printf("$%.2f has been withdrawn. Your new balance is: $%.2f%n", withdrawAmount, balance);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        System.out.println("Invalid withdraw amount. Please enter a positive number.");
                    }
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the ATM. Have a nice day");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }

        scanner.close();
    }
}

