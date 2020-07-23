package com.codedifferently.bankaccountlab;

public class SavingAccount extends BankAccount {
    private double rate;

    public SavingAccount(String accountNumber, double fees, String name, String password, double rate, double balance) {
        super(accountNumber, fees, name,password, AccountTypeEnum.SAVING_ACCOUNT, balance);
        this.rate = rate;

    }

    public String toString(){
        return this.getAccountNumber() + " " + this.getFees() + " " + this.getName() + " " + this.getBalance() + " "
                + this.getRate();
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}


