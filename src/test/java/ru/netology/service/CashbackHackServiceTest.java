package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {
    CashbackHackService cashback = new CashbackHackService();

    @Test
    public void shouldShowAmountToCashback() {
        int actual = cashback.remain(900);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldShowAmountToCashbackBorder() {
        int actual = cashback.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}
