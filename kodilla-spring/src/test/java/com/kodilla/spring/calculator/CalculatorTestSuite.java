package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    void testCalculations() {
        //Given

        //When
        double result1 = calculator.add(calculator.a, calculator.b);
        double result2 = calculator.sub(calculator.a, calculator.b);
        double result3 = calculator.mul(calculator.a, calculator.b);
        double result4 = calculator.div(calculator.a, calculator.b);
        //Then
        assertEquals(6, result1);
        assertEquals(0, result2);
        assertEquals(9, result3);
        assertEquals(1, result4);
    }
}
