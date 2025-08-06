package com.ggalantecode.restcalculator.service;

import com.ggalantecode.restcalculator.dto.ArithmeticOperationInputData;
import com.ggalantecode.restcalculator.dto.ArithmeticOperationResultData;
import com.ggalantecode.restcalculator.strategy.Addition;
import com.ggalantecode.restcalculator.strategy.Division;
import com.ggalantecode.restcalculator.strategy.Multiplication;
import com.ggalantecode.restcalculator.strategy.Subtraction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationServiceImplTest {

    private final CalculationService calculationService = new CalculationServiceImpl();

    @Test
    void givenAdditionAndInputDataWithOneAndTwo_whenCalculateOperation_thenReturnResultDataWithThree() {
        calculationService.setArithmeticOperation(new Addition());
        ArithmeticOperationInputData input = new ArithmeticOperationInputData(1d, 2d, null);
        ArithmeticOperationResultData result = calculationService.calculateOperation(input);
        assertEquals(3d, result.calculationResult());
    }

    @Test
    void givenSubtractionAndInputDataWithOneAndTwo_whenCalculateOperation_thenReturnResultDataWithNegativeOne() {
        calculationService.setArithmeticOperation(new Subtraction());
        ArithmeticOperationInputData input = new ArithmeticOperationInputData(1d, 2d, null);
        ArithmeticOperationResultData result = calculationService.calculateOperation(input);
        assertEquals(-1d, result.calculationResult());
    }

    @Test
    void givenMultiplicationAndInputDataWithOneAndTwo_whenCalculateOperation_thenReturnResultDataWithTwo() {
        calculationService.setArithmeticOperation(new Multiplication());
        ArithmeticOperationInputData input = new ArithmeticOperationInputData(1d, 2d, null);
        ArithmeticOperationResultData result = calculationService.calculateOperation(input);
        assertEquals(2d, result.calculationResult());
    }

    @Test
    void givenMultiplicationAndInputDataWithTwoAndThree_whenCalculateOperation_thenReturnResultDataWithSix() {
        calculationService.setArithmeticOperation(new Multiplication());
        ArithmeticOperationInputData input = new ArithmeticOperationInputData(2d, 3d, null);
        ArithmeticOperationResultData result = calculationService.calculateOperation(input);
        assertEquals(6d, result.calculationResult());
    }

    @Test
    void givenDivisionAndInputDataWithOneAndTwo_whenCalculateOperation_thenReturnResultDataWithZeroPointFive() {
        calculationService.setArithmeticOperation(new Division());
        ArithmeticOperationInputData input = new ArithmeticOperationInputData(1d, 2d, null);
        ArithmeticOperationResultData result = calculationService.calculateOperation(input);
        assertEquals(.5d, result.calculationResult());
    }

    @Test
    void givenNoArithmeticOperationAndInputData_whenCalculateOperation_thenThrowNullPointerException() {
        calculationService.setArithmeticOperation(null);
        ArithmeticOperationInputData input = new ArithmeticOperationInputData(1d, 2d, null);
        assertThrows(NullPointerException.class, () -> calculationService.calculateOperation(input));
    }

    @Test
    void givenNoArithmeticOperationAndNoInputData_whenCalculateOperation_thenThrowNullPointerException() {
        calculationService.setArithmeticOperation(null);
        assertThrows(NullPointerException.class, () -> calculationService.calculateOperation(null));
    }

    @Test
    void givenAdditionAndNoInputData_whenCalculateOperation_thenThrowNullPointerException() {
        calculationService.setArithmeticOperation(new Addition());
        assertThrows(NullPointerException.class, () -> calculationService.calculateOperation(null));
    }

    @Test
    void givenSubtractionAndNoInputData_whenCalculateOperation_thenThrowNullPointerException() {
        calculationService.setArithmeticOperation(new Subtraction());
        assertThrows(NullPointerException.class, () -> calculationService.calculateOperation(null));
    }

    @Test
    void givenMultiplicationAndNoInputData_whenCalculateOperation_thenThrowNullPointerException() {
        calculationService.setArithmeticOperation(new Multiplication());
        assertThrows(NullPointerException.class, () -> calculationService.calculateOperation(null));
    }

    @Test
    void givenDivisionAndNoInputData_whenCalculateOperation_thenThrowNullPointerException() {
        calculationService.setArithmeticOperation(new Division());
        assertThrows(NullPointerException.class, () -> calculationService.calculateOperation(null));
    }

}