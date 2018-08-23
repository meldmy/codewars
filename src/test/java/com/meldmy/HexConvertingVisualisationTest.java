package com.meldmy;

import org.junit.Test;

import static com.meldmy.HexConvertingVisualisation.showHexConversion;
import static org.junit.Assert.*;

public class HexConvertingVisualisationTest {

    @Test
    public void shouldReceiveHexConvertedVisualisation() {
        assertEquals("1000/16=62 R  8\n  62/16= 3 R 14\n   3/16= 0 R  3\nResult=3E8",
                showHexConversion(1000));
    }

    @Test
    public void shouldReturnZeroWhenReceiveHexFrom0() {
        assertEquals("Result=0", showHexConversion(0));
    }
}