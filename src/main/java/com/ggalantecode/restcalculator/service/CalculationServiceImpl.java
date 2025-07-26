package com.ggalantecode.restcalculator.service;

import com.ggalantecode.restcalculator.dto.ArithmeticOperationInputData;
import com.ggalantecode.restcalculator.dto.ArithmeticOperationResultData;
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
    public ArithmeticOperationResultData calculateOperation(ArithmeticOperationInputData inputData) {
        double firstNumber = inputData.firstNumber();
        double secondNumber = inputData.secondNumber();
        double result = arithmeticOperation.calculate(firstNumber, secondNumber);
        return new ArithmeticOperationResultData(result);
    }
}
