package org.Bank;

// The class should have the following properties:
// Balance
// MinimumBalance
// AccountHolderName

// The class should have the following methods:
// Withdraw
// Deposit

public class CurrentAccount {
    String accountHolderName;
    int balance;
    int minimumBalance;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMinimumBalance() {
        return minimumBalance;
    }

    public CurrentAccount(String accountHolderName, int balance, int minimumBalance){
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public void Deposit(int depAmount){

    }

}

