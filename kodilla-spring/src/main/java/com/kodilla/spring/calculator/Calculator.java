package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    Display display;

    double a = 2.0;
    double b = 3.0;

    public double add(double a, double b) {
        display.displayValue(a+b);
        return a + b;
    }

    public double sub(double a, double b) {
        display.displayValue(a-b);
        return a - b;
    }

    public double mul(double a, double b) {
        display.displayValue(a*b);
        return a * b;
    }

    public double div(double a, double b) {
        display.displayValue(a/b);
        return a / b;
    }
}
