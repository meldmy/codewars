package com.meldmy;

import static java.util.regex.Pattern.compile;
import static java.util.stream.Collectors.joining;

/**
 * @author Dmytro Melnychuk
 */
public class SpinWords {
    public String spinWords(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();
        return compile("\\s* \\s*")
                .splitAsStream(sentence)
                .map(i -> i.length() < 5 ? i
                        : stringBuilder.delete(0, stringBuilder.length()).append(i).reverse())
                .collect(joining(" "));
    }
}
