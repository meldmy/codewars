package com.meldmy;

import static java.util.stream.IntStream.range;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * <p>
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
 * <p>
 * Note: If the number is a multiple of both 3 and 5, only count it once.
 */
public class MultiplesThreeOrFive {
    int solution(int number) {
        return range(2, number).filter(i -> i % 3 == 0 || i % 5 == 0).sum();
    }
}
