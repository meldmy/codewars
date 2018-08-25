package com.meldmy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplesThreeOrFiveTest {
    @Test
    public void shoudReturnSum() {
        assertEquals(23, new MultiplesThreeOrFive().solution(10));
    }
}