package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackHackServiceTest {

    @Test
    public void remain() {
        assertEquals(1000, new CashBackHackService().remain(1000));
    }

    @Test
    public void remainUnderAmount() {
        assertEquals(100, new CashBackHackService().remain(900));
    }

    @Test
    public void remainOverAmount() {
        assertEquals(900, new CashBackHackService().remain(1100));
    }
}