package com.meldmy;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacters {
    static Map<Character, Integer> getCountLettersOccurence(String str) {
        Map<Character, Integer> result = new HashMap<>();
        int[] charCodes = new int[255];
        int wordLength = str.length();
        for (int i = 0; i < wordLength; i++) charCodes[str.charAt(i)]++;
        for (int i = 0; i < charCodes.length; i++)
            if (charCodes[i] > 0) result.put((char) i, charCodes[i]);
        return result;
    }
}

