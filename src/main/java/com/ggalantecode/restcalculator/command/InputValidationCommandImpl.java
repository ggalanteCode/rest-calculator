package com.ggalantecode.restcalculator.command;

import com.ggalantecode.restcalculator.dto.*;
import com.ggalantecode.restcalculator.exceptions.DivisionByZeroException;
import com.ggalantecode.restcalculator.service.CalculationService;
import com.ggalantecode.restcalculator.strategy.ArithmeticOperation;

import static com.ggalantecode.restcalculator.strategy.ArithmeticOperation.DIVISION;

public class InputValidationCommandImpl implements InputValidationCommand {

    private CalculationService calculationService;

    public InputValidationCommandImpl(CalculationService service) {
        calculationService = service;
    }

    @Override
    public ArithmeticOperationResult validateAndSendInputForCalculation(ArithmeticOperationInput inputData) {
        validateInput(inputData);
        return calculationService.selectOperationAndCalculate(inputData);
    }

    private void validateInput(ArithmeticOperationInput input) {
        String requestedOperation = input.operation();
        String requestedOperationUppercase = requestedOperation.toUpperCase().trim();
        ArithmeticOperation arithmeticOperation = ArithmeticOperation.valueOf(requestedOperationUppercase);
        if (isDivisionByZero(arithmeticOperation, input.secondNumber())) {
            throw new DivisionByZeroException("error! division by zero");
        }
    }

    private boolean isDivisionByZero(ArithmeticOperation requestedOperation, double secondNumber) {
        return requestedOperation == DIVISION && secondNumber == 0d;
    }

}
