package com.ggalantecode.restcalculator.command;

import com.ggalantecode.restcalculator.dto.ArithmeticOperationInput;
import com.ggalantecode.restcalculator.dto.ArithmeticOperationResult;
import com.ggalantecode.restcalculator.exceptions.DivisionByZeroException;
import com.ggalantecode.restcalculator.service.CalculationServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidationCommandImplTest {

    private final InputValidationCommand inputValidationCommand;

    public InputValidationCommandImplTest() {
        inputValidationCommand = new InputValidationCommandImpl();
        inputValidationCommand.setCalculationService(new CalculationServiceImpl());
    }

    @Test
    void givenNoArithmeticOperationInput_whenValidateAndSendInputForCalculation_thenThrowNullPointerException() {
        assertThrows(NullPointerException.class, () -> inputValidationCommand.validateAndSendInputForCalculation(null));
    }

    @Test
    void givenArithmeticOperationInputWithOneAndTwoAndAdditionUppercase_whenValidateAndSendInputForCalculation_thenReturnThree() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(1d, 2d, "ADDITION");
        double expectedValue = input.firstNumber() + input.secondNumber();
        ArithmeticOperationResult actualResult = inputValidationCommand.validateAndSendInputForCalculation(input);
        assertEquals(expectedValue, actualResult.calculationResult());
    }

    @Test
    void givenArithmeticOperationInputWithOneAndTwoAndSubtractionUppercase_whenValidateAndSendInputForCalculation_thenReturnNegativeOne() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(1d, 2d, "SUBTRACTION");
        double expectedValue = input.firstNumber() - input.secondNumber();
        ArithmeticOperationResult actualResult = inputValidationCommand.validateAndSendInputForCalculation(input);
        assertEquals(expectedValue, actualResult.calculationResult());
    }

    @Test
    void givenArithmeticOperationInputWithTwoAndTwoAndMultiplicationUppercase_whenValidateAndSendInputForCalculation_thenReturnFour() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(2d, 2d, "MULTIPLICATION");
        double expectedValue = input.firstNumber() * input.secondNumber();
        ArithmeticOperationResult actualResult = inputValidationCommand.validateAndSendInputForCalculation(input);
        assertEquals(expectedValue, actualResult.calculationResult());
    }

    @Test
    void givenArithmeticOperationInputWithOneAndTwoAndDivisionUppercase_whenValidateAndSendInputForCalculation_thenReturnZeroPointFive() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(1d, 2d, "DIVISION");
        double expectedValue = input.firstNumber() / input.secondNumber();
        ArithmeticOperationResult actualResult = inputValidationCommand.validateAndSendInputForCalculation(input);
        assertEquals(expectedValue, actualResult.calculationResult());
    }

    @Test
    void givenInputWithZeroAsSecondNumberAndDivisionAsOperation_whenValidateAndSendInputForCalculation_thenThrowDivisionByZeroException() {
        ArithmeticOperationInput input = new ArithmeticOperationInput(1d, 0d, "DIVISION");
        assertThrows(DivisionByZeroException.class, () -> inputValidationCommand.validateAndSendInputForCalculation(input));
    }

}