package com.meldmy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Dmytro Melnychuk
 */
public class XbonacciTest {

    @Test
    public void shouldCreateProperTribonacciSequence() {
        Xbonacci xbonacci = new Xbonacci();

        assertArrayEquals(new double[]{1, 1, 1, 3, 5, 9, 17, 31, 57, 105}, xbonacci.tribonacci(new double[]{1, 1, 1}, 10), 1e-10);
        assertArrayEquals(new double[]{0, 0, 1, 1, 2, 4, 7, 13, 24, 44}, xbonacci.tribonacci(new double[]{0, 0, 1}, 10), 1e-10);
        assertArrayEquals(new double[]{0, 1, 1, 2, 4, 7, 13, 24, 44, 81}, xbonacci.tribonacci(new double[]{0, 1, 1}, 10), 1e-10);
    }
}