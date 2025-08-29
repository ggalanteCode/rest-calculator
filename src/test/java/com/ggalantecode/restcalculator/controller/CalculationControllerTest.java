package com.ggalantecode.restcalculator.controller;

import com.ggalantecode.restcalculator.command.*;
import com.ggalantecode.restcalculator.dto.*;
import com.ggalantecode.restcalculator.service.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationControllerTest {

    private final CalculationController calculationController;

    public CalculationControllerTest() {
        CalculationService service = new CalculationServiceImpl();
        InputValidationCommand command = new InputValidationCommandImpl(service);
        calculationController = new CalculationController(command);
    }

    @Test
    void givenInputWithOneAndTwoAndAdditionUppercase_whenRequestCalculation_thenReturnResultWithThree() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(1d, 2d, "ADDITION");
        double expectedResult = input.firstNumber() + input.secondNumber();
        ArithmeticOperationResult actualResult = calculationController.requestCalculation(input);
        assertEquals(expectedResult, actualResult.calculationResult());
    }

    @Test
    void givenInputWithOneAndTwoAndSubtractionUppercase_whenRequestCalculation_thenReturnResultWithNegativeOne() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(1d, 2d, "SUBTRACTION");
        double expectedResult = input.firstNumber() - input.secondNumber();
        ArithmeticOperationResult actualResult = calculationController.requestCalculation(input);
        assertEquals(expectedResult, actualResult.calculationResult());
    }

    @Test
    void givenInputWithTwoAndThreeAndMultiplicationUppercase_whenRequestCalculation_thenReturnResultWithSix() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(2d, 3d, "MULTIPLICATION");
        double expectedResult = input.firstNumber() * input.secondNumber();
        ArithmeticOperationResult actualResult = calculationController.requestCalculation(input);
        assertEquals(expectedResult, actualResult.calculationResult());
    }

}