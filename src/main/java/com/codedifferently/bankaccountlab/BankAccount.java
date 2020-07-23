package com.codedifferently.bankaccountlab;


public class BankAccount {
    private String accountNumber;
    private double fees;
    private String name;
    private double balance;
    private String password;
    private AccountTypeEnum accountTypeEnum;

    public BankAccount(String accountNumber, double fees, String name, String password, AccountTypeEnum accountTypeEnum, double balance){
        this.accountNumber = accountNumber;
        this.fees = fees;
        this.name = name;
        this.password = password;
        this.balance = 0.0;
        this.accountTypeEnum = accountTypeEnum;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountTypeEnum getAccountTypeEnum() {
        return accountTypeEnum;
    }

    public void setAccountTypeEnum(AccountTypeEnum accountTypeEnum) {
        this.accountTypeEnum = accountTypeEnum;
    }
}
