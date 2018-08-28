package com.meldmy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Dmytro Melnychuk
 */
public class SpinWordsTest {
    @Test
    public void test() {
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
    }
}