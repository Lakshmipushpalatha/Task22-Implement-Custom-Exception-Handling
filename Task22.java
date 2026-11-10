import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class InvalidAccountException extends Exception {
    public InvalidAccountException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidTransactionAmountException extends Exception {
    public InvalidTransactionAmountException(String message) {
        super(message);
    }
}

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber,
                       String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount)
            throws InvalidTransactionAmountException {

        if (amount <= 0) {
            throw new InvalidTransactionAmountException(
                "Transaction amount must be greater than zero.");
        }

        balance += amount;
        System.out.println("Amount deposited successfully!");
        System.out.println("Updated Balance: Rs." + balance);
    }

    public void withdraw(double amount)
            throws InvalidTransactionAmountException,
                   InsufficientBalanceException {

        if (amount <= 0) {
            throw new InvalidTransactionAmountException(
                "Transaction amount must be greater than zero.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance! Available balance: Rs." + balance);
        }

        balance -= amount;
        System.out.println("Amount withdrawn successfully!");
        System.out.println("Updated Balance: Rs." + balance);
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Available Balance: Rs." + balance);
    }
}

public class Task22 {

    static Map<String, BankAccount> accounts = new HashMap<>();

    public static BankAccount findAccount(String accountNumber)
            throws InvalidAccountException {

        BankAccount account = accounts.get(accountNumber);

        if (account == null) {
            throw new InvalidAccountException(
                "Invalid account number! Account not found.");
        }

        return account;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        accounts.put("1001",
            new BankAccount("1001", "Lakshmi", 5000));

        accounts.put("1002",
            new BankAccount("1002", "Rahul", 3000));

        int choice = 0;

        System.out.println("================================");
        System.out.println("      BANKING MANAGEMENT SYSTEM");
        System.out.println("================================");

        while (choice != 4) {

            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

                if (choice < 1 || choice > 4) {
                    System.out.println("Invalid menu choice!");
                    continue;
                }

                if (choice == 4) {
                    System.out.println("Thank you for using our bank!");
                    break;
                }

                System.out.print("Enter Account Number: ");
                String accountNumber = sc.nextLine();

                BankAccount account = findAccount(accountNumber);

                switch (choice) {

                    case 1:
                        account.displayBalance();
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: Rs.");
                        double depositAmount =
                            Double.parseDouble(sc.nextLine());

                        account.deposit(depositAmount);
                        break;

                    case 3:
                        System.out.print("Enter withdrawal amount: Rs.");
                        double withdrawAmount =
                            Double.parseDouble(sc.nextLine());

                        account.withdraw(withdrawAmount);
                        break;
                }

            } catch (InvalidAccountException e) {
                System.out.println("Account Error: " + e.getMessage());

            } catch (InsufficientBalanceException e) {
                System.out.println("Balance Error: " + e.getMessage());

            } catch (InvalidTransactionAmountException e) {
                System.out.println("Transaction Error: " + e.getMessage());

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");

            } finally {
                System.out.println("\nOperation completed.");
            }
        }

        sc.close();
    }
}
