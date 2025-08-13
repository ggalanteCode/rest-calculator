package com.ggalantecode.restcalculator.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static com.ggalantecode.restcalculator.strategy.ArithmeticOperation.SUBTRACTION;

class SubtractionTest {

    @Test
    void givenOneAndTwo_whenCalculateSubtraction_thenReturnNegativeOne() {
        double firstNumber = 1d;
        double secondNumber = 2d;
        double expectedCalculationResult = firstNumber - secondNumber;
        double actualCalculationResult = SUBTRACTION.calculate(firstNumber, secondNumber);
        assertEquals(expectedCalculationResult, actualCalculationResult);
    }

    @Test
    void givenDoubleMinValueAndOne_whenCalculateSubtraction_thenReturnDifferenceBetweenThem() {
        double firstNumber = Double.MIN_VALUE;
        double secondNumber = 1d;
        double expectedCalculationResult = firstNumber - secondNumber;
        double actualCalculationResult = SUBTRACTION.calculate(firstNumber, secondNumber);
        assertEquals(expectedCalculationResult, actualCalculationResult);
    }

    @Test
    void givenDoubleMinValueAndDoubleMinValue_whenCalculateSubtraction_thenReturnZero() {
        double firstNumber = Double.MIN_VALUE;
        double secondNumber = Double.MIN_VALUE;
        double expectedCalculationResult = firstNumber - secondNumber;
        double actualCalculationResult = SUBTRACTION.calculate(firstNumber, secondNumber);
        assertEquals(expectedCalculationResult, actualCalculationResult);
    }

}