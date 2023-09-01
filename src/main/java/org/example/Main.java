package org.example;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000.0, 500.0);
        BankAccount account2 = new BankAccount(2000.0, 1500.0);

        account1.deposit(200.0, "checking");
        account2.deposit(300.0, "savings");

        boolean withdrawSuccess1 = account1.withdraw(300.0, "checking");
        boolean withdrawSuccess2 = account2.withdraw(2000.0, "savings");

        System.out.println("Account 1:");
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Checking Balance: " + account1.getCheckingBalance());
        System.out.println("Savings Balance: " + account1.getSavingsBalance());
        System.out.println("Total Balance: " + account1.getTotalBalance());

        System.out.println("\nAccount 2:");
        System.out.println("Account Number: " + account2.getAccountNumber());
        System.out.println("Checking Balance: " + account2.getCheckingBalance());
        System.out.println("Savings Balance: " + account2.getSavingsBalance());
        System.out.println("Total Balance: " + account2.getTotalBalance());

        System.out.println("\nNumber of Accounts Created: " + BankAccount.getNumberOfAccounts());
        System.out.println("Total Money Stored in All Accounts: " + BankAccount.getTotalMoneyStored());
    }
}
