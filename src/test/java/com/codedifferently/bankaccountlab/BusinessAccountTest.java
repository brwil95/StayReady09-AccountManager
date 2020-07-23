package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class BusinessAccountTest {

    @Test
    public void BusinessTaxIdTest() {
        //given
        BusinessAccount business1 = new BusinessAccount("1234", 12.00, "Paul", "hello", 1566, 1566);
        int expected = 1566;
        //when
        int actual = business1.getTaxId();
        //then
        Assert.assertEquals(expected, actual);
    }
}

