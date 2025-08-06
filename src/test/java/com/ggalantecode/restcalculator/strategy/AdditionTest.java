package com.ggalantecode.restcalculator.strategy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest extends ArithmeticOperationTest {

    @BeforeAll
    static void init() {
        operation = new Addition();
    }

    @Test
    void givenOneAndTwo_whenCalculateAddition_thenReturnThreePointZero() {
        double firstNumber = 1d;
        double secondNumber = 2d;
        double actualResultValue = operation.calculate(firstNumber, secondNumber);
        double expectedResultValue = firstNumber + secondNumber;
        assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    void givenOneAndNegativeTwo_whenCalculateAddition_thenReturnNegativeOne() {
        double firstNumber = 1d;
        double secondNumber = -2d;
        double actualResultValue = operation.calculate(firstNumber, secondNumber);
        double expectedResultValue = firstNumber + secondNumber;
        assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    void givenZeroPointOneAndZeroPointOne_whenCalculateAddition_thenReturnZeroPointTwo() {
        double firstNumber = .1d;
        double secondNumber = .1d;
        double actualResultValue = operation.calculate(firstNumber, secondNumber);
        double expectedResultValue = firstNumber + secondNumber;
        assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    void givenOneAndZeroPointOne_whenCalculateAddition_thenReturnOnePointOne() {
        double firstNumber = 1d;
        double secondNumber = .1d;
        double actualResultValue = operation.calculate(firstNumber, secondNumber);
        double expectedResultValue = firstNumber + secondNumber;
        assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    void givenZeroPointOneAndOne_whenCalculateAddition_thenReturnOnePointOne() {
        double firstNumber = .1d;
        double secondNumber = 1d;
        double actualResultValue = operation.calculate(firstNumber, secondNumber);
        double expectedResultValue = firstNumber + secondNumber;
        assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    void givenDoubleMaxValueAndOne_whenCalculateAddition_thenReturnSumBetweenThem() {
        double firstNumber = Double.MAX_VALUE;
        double secondNumber = 1d;
        double actualResultValue = operation.calculate(firstNumber, secondNumber);
        double expectedResultValue = firstNumber + secondNumber;
        assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    void givenDoubleMaxValueAndDoubleMaxValue_whenCalculateAddition_thenNoExceptionIsThrown() {
        assertDoesNotThrow(() -> operation.calculate(Double.MAX_VALUE, Double.MAX_VALUE));
    }

}