package com.codedifferently.bankaccountlab;


import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {

    @Test
    public void getAccountNumberTest() {
        //given
        BankAccount bankAccount = new BankAccount("1234", 12.00, "Paul", "hello", AccountTypeEnum.CHECKING_ACCOUNT, 1566.00);
        String expected = "1234";
        //when
        String actual = bankAccount.getAccountNumber();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAccountNumberTest() {
        //given
        BankAccount bankAccount = new BankAccount("1234", 12.00, "Paul", "hello", AccountTypeEnum.CHECKING_ACCOUNT, 1566.00);
        String expected = "1234";
        //when
        bankAccount.setAccountNumber(expected);
        //then
        Assert.assertEquals(expected, bankAccount.getAccountNumber());
    }

    @Test
    public void getFeesTest() {
        //given
        BankAccount bankAccount = new BankAccount("1234", 12.00, "Paul", "hello", AccountTypeEnum.CHECKING_ACCOUNT, 1566.00);
        Double expected = 12.00;
        //when
        Double actual = bankAccount.getFees();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setFeesTest() {
        //given
        BankAccount bankAccount = new BankAccount("1234", 12.00, "Paul", "hello", AccountTypeEnum.CHECKING_ACCOUNT, 1566.00);
        Double expected = 12.00;
        //when
        bankAccount.setFees(expected);
        //then
        Assert.assertEquals(expected, bankAccount.getFees(),0);
    }

    @Test
    public void getNameTest(){
        //given
        BankAccount bankAccount = new BankAccount("1234", 12.00, "Paul", "hello", AccountTypeEnum.CHECKING_ACCOUNT, 1566.00);
        String expected = "Paul";
        //when
        String actual = bankAccount.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        //given
        BankAccount bankAccount = new BankAccount("1234", 12.00, "Paul", "hello", AccountTypeEnum.CHECKING_ACCOUNT, 1566.00);
        String expected = "Paul";
        //when
        bankAccount.setName(expected);
        //then
        Assert.assertEquals(expected, bankAccount.getName());
    }

    @Test
    public void getPasswordTest(){
        //given
        BankAccount bankAccount = new BankAccount("1234", 12.00, "Paul", "hello", AccountTypeEnum.CHECKING_ACCOUNT, 1566.00);
        String expected = "hello";
        //when
        String actual = bankAccount.getPassword();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setPasswordTest() {
        //given
        BankAccount bankAccount = new BankAccount("1234", 12.00, "Paul", "hello", AccountTypeEnum.CHECKING_ACCOUNT, 1566.00);
        String expected = "hello";
        //when
        bankAccount.setPassword(expected);
        //then
        Assert.assertEquals(expected, bankAccount.getPassword());
    }

    @Test
    public void getBalanceTest(){
        //given
        BankAccount bankAccount = new BankAccount("1234", 12.00, "Paul", "hello", AccountTypeEnum.CHECKING_ACCOUNT, 0.0);
        double expected = 0.0;
        //when
        double actual = bankAccount.getBalance();
        //then
        Assert.assertEquals(expected, actual,0);
    }

    @Test
    public void setBalanceTest() {
        //given
        BankAccount bankAccount = new BankAccount("1234", 12.00, "Paul", "hello", AccountTypeEnum.CHECKING_ACCOUNT, 1566.00);
        double expected = 1566.00;
        //when
        bankAccount.setBalance(expected);
        //then
        Assert.assertEquals(expected, bankAccount.getBalance(),0);
    }

    @Test
    public void getAccountTypeTest(){
        //given
        BankAccount bankAccount = new BankAccount("1234", 12.00, "Paul", "hello", AccountTypeEnum.CHECKING_ACCOUNT, 1566.00);
        AccountTypeEnum expected = AccountTypeEnum.CHECKING_ACCOUNT;
        //when
        AccountTypeEnum actual = bankAccount.getAccountTypeEnum();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setAccountTypeTest() {
        //given
        BankAccount bankAccount = new BankAccount("1234", 12.00, "Paul", "hello", AccountTypeEnum.CHECKING_ACCOUNT, 1566.00);
        AccountTypeEnum expected = AccountTypeEnum.CHECKING_ACCOUNT;
        //when
        bankAccount.setAccountTypeEnum(expected);
        //then
        Assert.assertEquals(expected, bankAccount.getAccountTypeEnum());
    }

}
