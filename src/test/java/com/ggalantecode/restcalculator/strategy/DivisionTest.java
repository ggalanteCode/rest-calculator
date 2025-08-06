package com.ggalantecode.restcalculator.strategy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisionTest extends ArithmeticOperationTest {

    @BeforeAll
    static void init() {
        operation = new Division();
    }

    @Test
    void givenFourAndTwo_whenCalculateDivision_thenReturnTwoPointZero() {
        double firstNumber = 4d;
        double secondNumber = 2d;
        double actualResultValue = operation.calculate(firstNumber, secondNumber);
        double expectedResultValue = firstNumber / secondNumber;
        assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    void givenNegativeFourAndTwo_whenCalculateDivision_thenReturnNegativeTwoPointZero() {
        double firstNumber = -4d;
        double secondNumber = 2d;
        double actualResultValue = operation.calculate(firstNumber, secondNumber);
        double expectedResultValue = firstNumber / secondNumber;
        assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    void givenOneAndTwo_whenCalculateDivision_thenReturnZeroPointFive() {
        double fisrtNumber = 1d;
        double secondNumber = 2d;
        double actualResultValue = operation.calculate(fisrtNumber, secondNumber);
        double expectedResultValue = fisrtNumber / secondNumber;
        assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    void givenOneAndZero_whenCalculateDivision_thenNoExceptionIsThrown() {
        assertDoesNotThrow(() -> operation.calculate(1d, 0d));
    }

    @Test
    void givenNegativeOneAndZero_whenCalculateDivision_thenNoExceptionIsThrown() {
        assertDoesNotThrow(() -> operation.calculate(-1d, 0d));
    }

    @Test
    void givenZeroAndZero_whenCalculateDivision_thenNoExceptionIsThrown() {
        assertDoesNotThrow(() -> operation.calculate(0d, 0d));
    }

}