package com.meldmy;

import org.junit.Test;

import java.util.Map;

import static com.meldmy.OccurenceOfCharacters.getCountLettersOccurence;
import static java.lang.Integer.valueOf;
import static org.junit.Assert.assertEquals;

public class OccurenceOfCharactersTest {

    @Test
    public void shouldCountLetters() {
        String givenWord = "abcaba";

        Map<Character, Integer> result = getCountLettersOccurence(givenWord);

        assertEquals(result.get("a".charAt(0)), valueOf(3));
        assertEquals(result.get("b".charAt(0)), valueOf(2));
        assertEquals(result.get("c".charAt(0)), valueOf(1));
    }
}