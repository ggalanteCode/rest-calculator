package com.ggalantecode.restcalculator.service;

import com.ggalantecode.restcalculator.dto.ArithmeticOperationInput;
import com.ggalantecode.restcalculator.dto.ArithmeticOperationResult;
import com.ggalantecode.restcalculator.strategy.ArithmeticOperation;
import org.springframework.stereotype.Service;

@Service
public class CalculationServiceImpl implements CalculationService {

    private ArithmeticOperation arithmeticOperation;

    @Override
    public void setArithmeticOperation(ArithmeticOperation operation) {
        arithmeticOperation = operation;
    }

    @Override
    public ArithmeticOperationResult calculateOperation(ArithmeticOperationInput inputData) {
        double firstNumber = inputData.firstNumber();
        double secondNumber = inputData.secondNumber();
        double result = arithmeticOperation.calculate(firstNumber, secondNumber);
        return new ArithmeticOperationResult(result);
    }
}
