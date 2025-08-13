package com.ggalantecode.restcalculator.service;

import com.ggalantecode.restcalculator.dto.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationServiceImplTest {

    private final CalculationService calculationService = new CalculationServiceImpl();

    @Test
    void givenInputDataWithOneAndTwoAndAdditionUppercase_whenCalculateOperation_thenReturnResultDataWithThree() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(1d, 2d, "ADDITION");
        double expectedValue = input.firstNumber() + input.secondNumber();
        ArithmeticOperationResult actualResult = calculationService.selectOperationAndCalculate(input);
        assertEquals(expectedValue, actualResult.calculationResult());
    }

    @Test
    void givenInputDataWithOneAndTwoAndAdditionLowercase_whenCalculateOperation_thenReturnResultDataWithThree() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(1d, 2d, "addition");
        double expectedValue = input.firstNumber() + input.secondNumber();
        ArithmeticOperationResult actualResult = calculationService.selectOperationAndCalculate(input);
        assertEquals(expectedValue, actualResult.calculationResult());
    }

    @Test
    void givenInputDataWithOneAndTwoAndSubtractionUppercase_whenCalculateOperation_thenReturnResultDataWithNegativeOne() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(1d, 2d, "SUBTRACTION");
        double expectedValue = input.firstNumber() - input.secondNumber();
        ArithmeticOperationResult actualResult = calculationService.selectOperationAndCalculate(input);
        assertEquals(expectedValue, actualResult.calculationResult());
    }

    @Test
    void givenInputDataWithOneAndTwoAndSubtractionLowercase_whenCalculateOperation_thenReturnResultDataWithNegativeOne() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(1d, 2d, "subtraction");
        double expectedValue = input.firstNumber() - input.secondNumber();
        ArithmeticOperationResult actualResult = calculationService.selectOperationAndCalculate(input);
        assertEquals(expectedValue, actualResult.calculationResult());
    }

    @Test
    void givenInputDataWithOneAndTwoAndMultiplicationUppercase_whenCalculateOperation_thenReturnResultDataWithTwo() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(1d, 2d, "MULTIPLICATION");
        double expectedValue = input.firstNumber() * input.secondNumber();
        ArithmeticOperationResult actualResult = calculationService.selectOperationAndCalculate(input);
        assertEquals(expectedValue, actualResult.calculationResult());
    }

    @Test
    void givenInputDataWithOneAndTwoAndMultiplicationLowercase_whenCalculateOperation_thenReturnResultDataWithTwo() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(1d, 2d, "multiplication");
        double expectedValue = input.firstNumber() * input.secondNumber();
        ArithmeticOperationResult actualResult = calculationService.selectOperationAndCalculate(input);
        assertEquals(expectedValue, actualResult.calculationResult());
    }

    @Test
    void givenInputDataWithTwoAndThreeAndMultiplicationUppercase_whenCalculateOperation_thenReturnResultDataWithSix() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(2d, 3d, "MULTIPLICATION");
        double expectedValue = input.firstNumber() * input.secondNumber();
        ArithmeticOperationResult actualResult = calculationService.selectOperationAndCalculate(input);
        assertEquals(expectedValue, actualResult.calculationResult());
    }

    @Test
    void givenInputDataWithOneAndTwoAndDivisionUppercase_whenCalculateOperation_thenReturnResultDataWithZeroPointFive() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(1d, 2d, "DIVISION");
        double expectedValue = input.firstNumber() / input.secondNumber();
        ArithmeticOperationResult actualResult = calculationService.selectOperationAndCalculate(input);
        assertEquals(expectedValue, actualResult.calculationResult());
    }

    @Test
    void givenInputDataWithOneAndTwoAndDivisionLowercase_whenCalculateOperation_thenReturnResultDataWithZeroPointFive() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(1d, 2d, "division");
        double expectedValue = input.firstNumber() / input.secondNumber();
        ArithmeticOperationResult actualResult = calculationService.selectOperationAndCalculate(input);
        assertEquals(expectedValue, actualResult.calculationResult());
    }

    @Test
    void givenInputDataWithOneAndTwoAndUnknownOperation_whenCalculateOperation_thenThrowIllegalArgumentException() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(1d, 2d, "");
        assertThrows(IllegalArgumentException.class, () -> calculationService.selectOperationAndCalculate(input));
    }

    @Test
    void givenInputDataAndNoArithmeticOperation_whenCalculateOperation_thenThrowNullPointerException() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(1d, 2d, null);
        assertThrows(NullPointerException.class, () -> calculationService.selectOperationAndCalculate(input));
    }

    @Test
    void givenNoInputData_whenCalculateOperation_thenThrowNullPointerException() {
        assertThrows(NullPointerException.class, () -> calculationService.selectOperationAndCalculate(null));
    }

    @Test
    void givenInputDataWithOneAndTwoAndOperationWithLeadingWhitespaces_whenCalculateOperation_thenReturnThree() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(1d, 2d, " ADDITION");
        double expectedValue = input.firstNumber() + input.secondNumber();
        ArithmeticOperationResult actualResult = calculationService.selectOperationAndCalculate(input);
        assertEquals(expectedValue, actualResult.calculationResult());
    }

    @Test
    void givenInputDataWithOneAndTwoAndOperationWithTrailingWhitespaces_whenCalculateOperation_thenReturnThree() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(1d, 2d, "ADDITION ");
        double expectedValue = input.firstNumber() + input.secondNumber();
        ArithmeticOperationResult actualResult = calculationService.selectOperationAndCalculate(input);
        assertEquals(expectedValue, actualResult.calculationResult());
    }

    @Test
    void givenInputDataWithOneAndTwoAndOperationWithLeadingAndTrailingWhitespaces_whenCalculateOperation_thenReturnThree() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(1d, 2d, " ADDITION ");
        double expectedValue = input.firstNumber() + input.secondNumber();
        ArithmeticOperationResult actualResult = calculationService.selectOperationAndCalculate(input);
        assertEquals(expectedValue, actualResult.calculationResult());
    }

}