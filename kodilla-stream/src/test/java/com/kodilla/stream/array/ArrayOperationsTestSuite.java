package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage()  {
        int[] numbers = new int[20];
        numbers[0] = 4;
        numbers[1] = 4;
        numbers[2] = 4;
        numbers[3] = 4;
        numbers[4] = 4;
        numbers[5] = 4;
        numbers[6] = 4;
        numbers[7] = 4;
        numbers[8] = 4;
        numbers[9] = 4;
        numbers[10] = 5;
        numbers[11] = 5;
        numbers[12] = 5;
        numbers[13] = 5;
        numbers[14] = 5;
        numbers[15] = 5;
        numbers[16] = 5;
        numbers[17] = 5;
        numbers[18] = 5;
        numbers[19] = 5;
        double expected = ArrayOperations.getAverage(numbers);
        Assertions.assertEquals(expected, 4.5);
    }
}
