package com.ggalantecode.restcalculator.service;

import com.ggalantecode.restcalculator.dto.*;
import com.ggalantecode.restcalculator.strategy.ArithmeticOperation;
import org.springframework.stereotype.Service;

@Service
public class CalculationServiceImpl implements CalculationService {

    @Override
    public ArithmeticOperationResult selectOperationAndCalculate(ArithmeticOperationInput inputData) {
        ArithmeticOperation arithmeticOperation = selectOperationFromInput(inputData.operation());
        double result = arithmeticOperation.calculate(inputData.firstNumber(), inputData.secondNumber());
        return new ArithmeticOperationResult(result);
    }

    private ArithmeticOperation selectOperationFromInput(String requestedOperation) {
        return ArithmeticOperation.valueOf(requestedOperation.toUpperCase().trim());
    }

}
