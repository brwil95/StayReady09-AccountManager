package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class CheckingAccountTest {


    @Test
    public void AccountNumberTest(){
        //Given
        CheckingAccount checkingAccount = new CheckingAccount("1232",12.88,"JOE","Password", 1234.00);
        String expectedAccountNumber = "1232";

        //When
        String actualAccountNumber = checkingAccount.getAccountNumber();

        //Then
        Assert.assertEquals(expectedAccountNumber, actualAccountNumber);

    }



    @Test
    public void FeesTest(){
        //Given
        CheckingAccount checkingAccount = new CheckingAccount("1232",12.88,"JOE","Password", 1234.00);
        double expectedFee = 12.88;

        //When
        double actualFee = checkingAccount.getFees();

        //Then
        Assert.assertEquals(expectedFee, actualFee, 0.0);

    }

    @Test
    public void NameTest(){
        //given
        CheckingAccount checkingAccount = new CheckingAccount("1232",12.88,"JOE","Password", 1234.00);
        String expectedName = "JOE";

        //when
        String actualName = checkingAccount.getName();

        //then
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public void BalanceTest(){
        //given
        CheckingAccount checkingAccount = new CheckingAccount("1232",12.88,"JOE","Password", 1234.00);
        //double expectedBalance = 1234.00;
        //when
        double expectedBalance = 1234.00;
        checkingAccount.setBalance(expectedBalance);
        double actualBalance = checkingAccount.getBalance();

        //then
        Assert.assertEquals(expectedBalance,actualBalance, 0.0);
    }
}
