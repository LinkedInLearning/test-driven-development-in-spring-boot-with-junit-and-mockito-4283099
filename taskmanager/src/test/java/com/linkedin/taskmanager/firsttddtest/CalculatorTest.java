package com.linkedin.taskmanager.firsttddtest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    @Test
    void testDivideTwoPositiveNumbers() {
        // arrange
        Calculator calculator = new Calculator();

        // act
        double result = calculator.divide(6, 2);

        // assert
        assertEquals(3.0, result);
    }

    @Test
    void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }

    @Test
    void testDivideNegativeNumbers() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(-6, -2);
        assertEquals(3.0, result);
    }
}