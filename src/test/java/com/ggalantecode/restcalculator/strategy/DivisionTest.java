package com.ggalantecode.restcalculator.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static com.ggalantecode.restcalculator.strategy.ArithmeticOperation.DIVISION;

class DivisionTest {

    @Test
    void givenFourAndTwo_whenCalculateDivision_thenReturnTwoPointZero() {
        double firstNumber = 4d;
        double secondNumber = 2d;
        double expectedResultValue = firstNumber / secondNumber;
        double actualResultValue = DIVISION.calculate(firstNumber, secondNumber);
        assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    void givenNegativeFourAndTwo_whenCalculateDivision_thenReturnNegativeTwoPointZero() {
        double firstNumber = -4d;
        double secondNumber = 2d;
        double expectedResultValue = firstNumber / secondNumber;
        double actualResultValue = DIVISION.calculate(firstNumber, secondNumber);
        assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    void givenOneAndTwo_whenCalculateDivision_thenReturnZeroPointFive() {
        double fisrtNumber = 1d;
        double secondNumber = 2d;
        double expectedResultValue = fisrtNumber / secondNumber;
        double actualResultValue = DIVISION.calculate(fisrtNumber, secondNumber);
        assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    void givenOneAndZero_whenCalculateDivision_thenNoExceptionIsThrown() {
        assertDoesNotThrow(() -> DIVISION.calculate(1d, 0d));
    }

    @Test
    void givenNegativeOneAndZero_whenCalculateDivision_thenNoExceptionIsThrown() {
        assertDoesNotThrow(() -> DIVISION.calculate(-1d, 0d));
    }

    @Test
    void givenZeroAndZero_whenCalculateDivision_thenNoExceptionIsThrown() {
        assertDoesNotThrow(() -> DIVISION.calculate(0d, 0d));
    }

}