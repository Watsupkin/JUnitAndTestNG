package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackServiceTest {

    @Test
    public void testRemainIfAmount() {
        assertEquals(new CashBackHackService().remain(1000), 1000);
    }
}