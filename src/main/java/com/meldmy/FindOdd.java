package com.meldmy;

import java.util.stream.IntStream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.groupingBy;

/**
 * @author Dmytro Melnychuk
 */
public class FindOdd {
    public static int findIt(int[] a) {
        return IntStream.of(a)
                .boxed()

                .collect(groupingBy(identity()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue().size() % 2 != 0)
                .findFirst().get().getKey();
    }
}
