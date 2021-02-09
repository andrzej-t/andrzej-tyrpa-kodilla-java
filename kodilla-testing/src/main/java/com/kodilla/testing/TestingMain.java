package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(10,5);

        int result1 = calculator.add(calculator.getA(), calculator.getB());

        if (result1 == 10+5) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        int result2 = calculator.subtract(calculator.getA(), calculator.getB());

        if (result2 == 10-5) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
