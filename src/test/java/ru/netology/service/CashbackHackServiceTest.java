package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateIfAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual,expected);

    }

    @Test
    public void shouldCalculateIfAmountIs1To999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 350;

        int actual = service.remain(amount);
        int expected = 650;

        assertEquals(actual,expected);

    }
    @Test
    public void shouldCalculateIfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual,expected);

    }

    @Test
    public void shouldCalculateIfAmountIsMoreThen1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual,expected);

    }
    @Test
    public void shouldCalculateIfAmountIs3000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

}