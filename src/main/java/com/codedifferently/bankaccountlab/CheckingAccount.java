package com.codedifferently.bankaccountlab;

public class CheckingAccount extends BankAccount{


    public CheckingAccount(String accountNumber, double fees, String name, String password, double balance) {
        super(accountNumber, fees, name, password, AccountTypeEnum.CHECKING_ACCOUNT, balance);
    }

    public String toString(){
        return this.getAccountNumber() + " " + this.getFees() + " " + this.getName() + " " + this.getBalance();
    }
}
