package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        calculator.display.displayValue(calculator.a + calculator.b);
        calculator.display.displayValue(calculator.a - calculator.b);
        calculator.display.displayValue(calculator.a * calculator.b);
        calculator.display.displayValue(calculator.a / calculator.b);
        //Then
        //do nothing
    }
}
