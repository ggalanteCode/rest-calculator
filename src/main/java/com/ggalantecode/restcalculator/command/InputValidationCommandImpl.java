package com.ggalantecode.restcalculator.command;

import com.ggalantecode.restcalculator.dto.*;
import com.ggalantecode.restcalculator.exceptions.DivisionByZeroException;
import com.ggalantecode.restcalculator.service.CalculationService;
import com.ggalantecode.restcalculator.strategy.ArithmeticOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.ggalantecode.restcalculator.strategy.ArithmeticOperation.DIVISION;

@Component
public class InputValidationCommandImpl implements InputValidationCommand {

    private CalculationService calculationService;

    @Autowired
    public InputValidationCommandImpl(CalculationService service) {
        calculationService = service;
    }

    @Override
    public ArithmeticOperationResult validateAndSendInputForCalculation(ArithmeticOperationInput inputData) {
        validateInput(inputData);
        return calculationService.selectOperationAndCalculate(inputData);
    }

    private void validateInput(ArithmeticOperationInput input) {
        ArithmeticOperation arithmeticOperation = getArithmeticOperationForValidation(input.operation());
        checkDivisionByZero(arithmeticOperation, input.secondNumber());
    }

    private ArithmeticOperation getArithmeticOperationForValidation(String requestedOperation) {
        return ArithmeticOperation.valueOf(requestedOperation.toUpperCase().trim());
    }

    private void checkDivisionByZero(ArithmeticOperation requestedOperation, double secondNumber) {
        if (isDivisionByZero(requestedOperation, secondNumber)) {
            throw new DivisionByZeroException("error! division by zero");
        }
    }

    private boolean isDivisionByZero(ArithmeticOperation requestedOperation, double secondNumber) {
        return requestedOperation == DIVISION && secondNumber == 0d;
    }

}
