package com.meldmy.arrays;

import org.junit.Test;

import static com.meldmy.arrays.ArrayLeftRotation.rotLeft;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Dmytro Melnychuk
 */
public class ArrayLeftRotationTest {

    @Test
    public void shouldReturnRotatedArray() {
        assertThat(rotLeft(new int[]{1, 2, 3, 4, 5}, 2)).containsExactly(3, 4, 5, 1, 2);
    }

    @Test
    public void shouldNotRotateArrayWhenRotationLeftIsZero() {
        assertThat(rotLeft(new int[]{1, 2, 3}, 0)).containsExactly(1, 2, 3);
    }
}