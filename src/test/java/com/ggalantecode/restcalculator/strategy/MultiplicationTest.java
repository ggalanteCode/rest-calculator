package com.ggalantecode.restcalculator.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static com.ggalantecode.restcalculator.strategy.ArithmeticOperation.MULTIPLICATION;

class MultiplicationTest {

    @Test
    void givenTwoAndThree_whenCalculateMultiplication_thenReturnSixPointZero() {
        double fisrtNumber = 2d;
        double secondNumber = 3d;
        double expectedCalculationResult = fisrtNumber * secondNumber;
        double actualCalculationResult = MULTIPLICATION.calculate(fisrtNumber, secondNumber);
        assertEquals(expectedCalculationResult, actualCalculationResult);
    }

    @Test
    void givenDoubleMaxValueAndZeroPointFive_whenCalculateMultiplication_thenReturnProductBetweenThem() {
        double firstNumber = Double.MAX_VALUE;
        double secondNumber = .5d;
        double expectedCalculationResult = firstNumber * secondNumber;
        double actualCalculationResult = MULTIPLICATION.calculate(firstNumber, secondNumber);
        assertEquals(expectedCalculationResult, actualCalculationResult);
    }

    @Test
    void givenDoubleMaxValueAndTwo_whenCalculateMultiplication_thenNoExceptionIsThrown() {
        assertDoesNotThrow(() -> MULTIPLICATION.calculate(Double.MAX_VALUE, 2d));
    }

}