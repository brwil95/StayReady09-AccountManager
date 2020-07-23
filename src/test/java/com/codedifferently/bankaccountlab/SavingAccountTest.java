package com.codedifferently.bankaccountlab;
import org.junit.Test;
import org.junit.Assert;


public class SavingAccountTest {

    @Test
    public void SavingAccountGetRateTest() {
        //given
        SavingAccount business1 = new SavingAccount("1234",13.00,"Briana","HelloWorld",12.00, 1234.00);
        double expected = 12.00;
        //when
        double actual = business1.getRate();
        //then
        Assert.assertEquals(expected, actual, 0.0);
    }
}
