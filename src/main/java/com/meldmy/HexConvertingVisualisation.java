package com.meldmy;

import static java.lang.Integer.toHexString;
import static java.lang.String.valueOf;

public class HexConvertingVisualisation {
    static String showHexConversion(int number) {
        return receiveCountingVisualization(number)
                .append("Result=")
                .append(toHexString(number).toUpperCase())
                .toString();
    }

    private static StringBuilder receiveCountingVisualization(int number) {
        StringBuilder builder = new StringBuilder();
        int temp;
        int spacesCount = digitCount(number);
        int firstDevided = digitCount(number / 16);
        boolean containsTwoDigitTail = isContainsTwoDigitTail(number);
        while (number > 0) {
            temp = digitCount(number);
            for (int i = 0; i < spacesCount - temp; i++)
                builder.append(" ");
            int mod = number % 16;
            builder.append(number + "/16=");

            temp = digitCount(number / 16);
            for (int i = 0; i < firstDevided - temp; i++)
                builder.append(" ");

            number = number / 16;
            builder.append(number)
                    .append(" R")
                    .append(mod < 10 && containsTwoDigitTail ? "  " : " ")
                    .append(valueOf(mod))
                    .append("\n");
        }
        return builder;
    }

    private static boolean isContainsTwoDigitTail(int number) {
        while (number / 10 > 0) {
            if (number % 16 > 9) {
                return true;
            }
            number = number / 16;
        }
        return false;
    }

    private static int digitCount(int number) {
        int length = 1;
        if (number >= 100000000) {
            length += 8;
            number /= 100000000;
        }
        if (number >= 10000) {
            length += 4;
            number /= 10000;
        }
        if (number >= 100) {
            length += 2;
            number /= 100;
        }
        if (number >= 10) {
            length += 1;
        }
        return length;
    }
}
