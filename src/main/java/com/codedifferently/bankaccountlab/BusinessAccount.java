package com.codedifferently.bankaccountlab;

public class BusinessAccount extends BankAccount {

    private int taxId;

    public BusinessAccount(String accountNumber, double fees, String name, String password, int taxId, double balance) {
        super(accountNumber, fees, name,password, AccountTypeEnum.BUSINESS_ACCOUNT, balance);
        this.taxId = taxId;

    }

    public String toString(){
        return this.getAccountNumber() + " " + this.getFees() + " " + this.getName() + " " + this.getBalance() + " "
                + this.getTaxId();
    }

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }
}
