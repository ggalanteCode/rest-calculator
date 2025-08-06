package com.ggalantecode.restcalculator.strategy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest extends ArithmeticOperationTest {

    @BeforeAll
    static void init() {
        operation = new Multiplication();
    }

    @Test
    void givenTwoAndThree_whenCalculateMultiplication_thenReturnSixPointZero() {
        double fisrtNumber = 2d;
        double secondNumber = 3d;
        double actualCalculationResult = operation.calculate(fisrtNumber, secondNumber);
        double expectedCalculationResult = fisrtNumber * secondNumber;
        assertEquals(expectedCalculationResult, actualCalculationResult);
    }

    @Test
    void givenDoubleMaxValueAndZeroPointFive_whenCalculateMultiplication_thenReturnProductBetweenThem() {
        double firstNumber = Double.MAX_VALUE;
        double secondNumber = .5d;
        double actualCalculationResult = operation.calculate(firstNumber, secondNumber);
        double expectedCalculationResult = firstNumber * secondNumber;
        assertEquals(expectedCalculationResult, actualCalculationResult);
    }

    @Test
    void givenDoubleMaxValueAndTwo_whenCalculateMultiplication_thenNoExceptionIsThrown() {
        assertDoesNotThrow(() -> operation.calculate(Double.MAX_VALUE, 2d));
    }

}