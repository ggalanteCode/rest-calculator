package com.ggalantecode.restcalculator.strategy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest extends ArithmeticOperationTest {

    @BeforeAll
    static void init() {
        operation = new Subtraction();
    }

    @Test
    void givenOneAndTwo_whenCalculateSubtraction_thenReturnNegativeOne() {
        double firstNumber = 1d;
        double secondNumber = 2d;
        double actualCalculationResult = operation.calculate(firstNumber, secondNumber);
        double expectedCalculationResult = firstNumber - secondNumber;
        assertEquals(expectedCalculationResult, actualCalculationResult);
    }

    @Test
    void givenDoubleMinValueAndOne_whenCalculateSubtraction_thenReturnDifferenceBetweenThem() {
        double firstNumber = Double.MIN_VALUE;
        double secondNumber = 1d;
        double actualCalculationResult = operation.calculate(firstNumber, secondNumber);
        double expectedCalculationResult = firstNumber - secondNumber;
        assertEquals(expectedCalculationResult, actualCalculationResult);
    }

    @Test
    void givenDoubleMinValueAndDoubleMinValue_whenCalculateSubtraction_thenReturnZero() {
        double firstNumber = Double.MIN_VALUE;
        double secondNumber = Double.MIN_VALUE;
        double actualCalculationResult = operation.calculate(firstNumber, secondNumber);
        double expectedCalculationResult = firstNumber - secondNumber;
        assertEquals(expectedCalculationResult, actualCalculationResult);
    }

}