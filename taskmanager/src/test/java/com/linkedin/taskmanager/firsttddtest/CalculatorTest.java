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
}