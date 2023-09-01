package org.example;

import java.util.Random;

public class BankAccount {
    private static int numberOfAccounts = 0;
    private static double totalMoneyStored = 0.0;

    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    public BankAccount(double initialCheckingBalance, double initialSavingsBalance) {
        this.checkingBalance = initialCheckingBalance;
        this.savingsBalance = initialSavingsBalance;
        this.accountNumber = generateRandomAccountNumber();
        numberOfAccounts++;
        totalMoneyStored += initialCheckingBalance + initialSavingsBalance;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void deposit(double amount, String accountType) {
        if ("checking".equalsIgnoreCase(accountType)) {
            checkingBalance += amount;
            totalMoneyStored += amount;
        } else if ("savings".equalsIgnoreCase(accountType)) {
            savingsBalance += amount;
            totalMoneyStored += amount;
        }
    }

    public boolean withdraw(double amount, String accountType) {
        if ("checking".equalsIgnoreCase(accountType)) {
            if (amount <= checkingBalance) {
                checkingBalance -= amount;
                totalMoneyStored -= amount;
                return true;
            }
        } else if ("savings".equalsIgnoreCase(accountType)) {
            if (amount <= savingsBalance) {
                savingsBalance -= amount;
                totalMoneyStored -= amount;
                return true;
            }
        }
        return false; // Insufficient funds or invalid account type
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static double getTotalMoneyStored() {
        return totalMoneyStored;
    }

    public double getTotalBalance() {
        return checkingBalance + savingsBalance;
    }

    private String generateRandomAccountNumber() {
        Random rand = new Random();
        StringBuilder accountNumber = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            accountNumber.append(rand.nextInt(10));
        }
        return accountNumber.toString();
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
