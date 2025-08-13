package com.ggalantecode.restcalculator.strategy;

import org.junit.jupiter.api.Test;

import static com.ggalantecode.restcalculator.strategy.ArithmeticOperation.ADDITION;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    void givenOneAndTwo_whenCalculateAddition_thenReturnThreePointZero() {
        double firstNumber = 1d;
        double secondNumber = 2d;
        double expectedResultValue = firstNumber + secondNumber;
        double actualResultValue = ADDITION.calculate(firstNumber, secondNumber);
        assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    void givenOneAndNegativeTwo_whenCalculateAddition_thenReturnNegativeOne() {
        double firstNumber = 1d;
        double secondNumber = -2d;
        double expectedResultValue = firstNumber + secondNumber;
        double actualResultValue = ADDITION.calculate(firstNumber, secondNumber);
        assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    void givenZeroPointOneAndZeroPointOne_whenCalculateAddition_thenReturnZeroPointTwo() {
        double firstNumber = .1d;
        double secondNumber = .1d;
        double expectedResultValue = firstNumber + secondNumber;
        double actualResultValue = ADDITION.calculate(firstNumber, secondNumber);
        assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    void givenOneAndZeroPointOne_whenCalculateAddition_thenReturnOnePointOne() {
        double firstNumber = 1d;
        double secondNumber = .1d;
        double expectedResultValue = firstNumber + secondNumber;
        double actualResultValue = ADDITION.calculate(firstNumber, secondNumber);
        assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    void givenZeroPointOneAndOne_whenCalculateAddition_thenReturnOnePointOne() {
        double firstNumber = .1d;
        double secondNumber = 1d;
        double expectedResultValue = firstNumber + secondNumber;
        double actualResultValue = ADDITION.calculate(firstNumber, secondNumber);
        assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    void givenDoubleMaxValueAndOne_whenCalculateAddition_thenReturnSumBetweenThem() {
        double firstNumber = Double.MAX_VALUE;
        double secondNumber = 1d;
        double expectedResultValue = firstNumber + secondNumber;
        double actualResultValue = ADDITION.calculate(firstNumber, secondNumber);
        assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    void givenDoubleMaxValueAndDoubleMaxValue_whenCalculateAddition_thenNoExceptionIsThrown() {
        assertDoesNotThrow(() -> ADDITION.calculate(Double.MAX_VALUE, Double.MAX_VALUE));
    }

}