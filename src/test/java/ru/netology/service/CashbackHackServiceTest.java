package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainIfAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldRemainIfAmountIs1To999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 350;

        int actual = service.remain(amount);
        int expected = 650;

        assertEquals(expected, actual);

    }
    @Test
    public void shouldRemainIfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldRemainIfAmountIsMoreThen1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);

    }
    @Test
    public void shouldRemainIfAmountIs3000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

}