# Task22-Implement-Custom-Exception-Handling
java calculation

## 1. Project Description

The Banking Management System is a simple Java console-based application that manages basic banking operations such as checking account balance, depositing money, and withdrawing money.

This project demonstrates the use of **Custom Exception Handling** in Java. It creates application-specific exceptions to handle invalid accounts, insufficient balance, and invalid transaction amounts.

The main purpose of this project is to understand how exceptions can be created and handled to prevent unexpected program termination.

## 2. Objectives

- Understand exception handling in Java.
- Create custom exception classes.
- Handle errors using try-catch blocks.
- Use the throw and throws keywords.
- Display meaningful error messages.
- Test invalid banking operations.

## 3. Features

1. **Check Balance:** Displays the account holder's name, account number, and available balance.
2. **Deposit Money:** Allows users to deposit money into their accounts.
3. **Withdraw Money:** Allows users to withdraw money if sufficient balance is available.
4. **Invalid Account Handling:** Displays an error when an account number does not exist.
5. **Insufficient Balance Handling:** Prevents withdrawals greater than the available balance.
6. **Invalid Transaction Handling:** Prevents zero or negative transaction amounts.
7. **Menu-Driven Interface:** Allows users to select banking operations.

## 4. Custom Exceptions

The following custom exception classes are implemented:

### 1. InvalidAccountException
This exception occurs when the entered account number does not exist in the banking system.

### 2. InsufficientBalanceException
This exception occurs when the withdrawal amount is greater than the available account balance.

### 3. InvalidTransactionAmountException
This exception occurs when the user enters a zero or negative deposit or withdrawal amount.

## 5. Java Concepts Used

- **Classes and Objects:** Used to create and manage bank accounts.
- **Inheritance:** Custom exception classes extend the Exception class.
- **HashMap:** Stores account numbers and their corresponding account objects.
- **Try-Catch:** Handles exceptions during banking operations.
- **Throw:** Used to generate custom exceptions.
- **Throws:** Declares exceptions that may occur in methods.
- **Finally:** Executes the final operation message regardless of whether an exception occurs.
- **Scanner:** Accepts input from the user.

## 6. Project Structure

```text
Task22/
│
├── Task22.java
│
└── README.md
```

## 7. Sample Accounts

The program contains two sample accounts:

| Account Number | Account Holder | Initial Balance |
|---|---|---|
| 1001 | Lakshmi | Rs. 5000 |
| 1002 | Rahul | Rs. 3000 |

## 8. Sample Output

```text
================================
      BANKING MANAGEMENT SYSTEM
================================

1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit

Enter your choice: 1
Enter Account Number: 1001

Account Holder: Lakshmi
Account Number: 1001
Available Balance: Rs.5000.0

Operation completed.
```

### Example: Successful Deposit

```text
Enter your choice: 2
Enter Account Number: 1001
Enter deposit amount: Rs.2000

Amount deposited successfully!
Updated Balance: Rs.7000.0
```

### Example: Insufficient Balance

```text
Enter your choice: 3
Enter Account Number: 1001
Enter withdrawal amount: Rs.10000

Balance Error: Insufficient balance!
Available balance: Rs.7000.0
```

### Example: Invalid Account

```text
Enter your choice: 1
Enter Account Number: 9999

Account Error: Invalid account number!
Account not found.
```

## 9. How to Run the Program

**Step 1:** Install Java JDK on your computer.

**Step 2:** Create a file named `Task22.java`.

**Step 3:** Copy the Java program into the file.

**Step 4:** Open Command Prompt or Terminal in the project folder.

**Step 5:** Compile the program.

```bash
javac Task22.java
```

**Step 6:** Run the program.

```bash
java Task22
```

**Step 7:** Select an option from the menu and enter the required details.

## 10. Test Cases

| Test Case | Expected Result |
|---|---|
| Check balance with valid account | Displays balance |
| Enter invalid account number | Invalid account exception |
| Deposit a positive amount | Deposit successful |
| Deposit a negative amount | Invalid transaction exception |
| Withdraw within available balance | Withdrawal successful |
| Withdraw more than available balance | Insufficient balance exception |
| Enter zero transaction amount | Invalid transaction exception |

## 11. Learning Outcomes

By completing this project, I learned:

- How to create custom exception classes in Java.
- How to handle application-specific errors.
- How to use try-catch-finally blocks.
- The difference between throw and throws.
- How to validate user inputs.
- How exception handling improves program reliability.
