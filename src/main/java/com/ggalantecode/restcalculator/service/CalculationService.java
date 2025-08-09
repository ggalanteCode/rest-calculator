package com.ggalantecode.restcalculator.service;

import com.ggalantecode.restcalculator.dto.ArithmeticOperationInput;
import com.ggalantecode.restcalculator.dto.ArithmeticOperationResult;
import com.ggalantecode.restcalculator.strategy.ArithmeticOperation;

public interface CalculationService {

    void setArithmeticOperation(ArithmeticOperation operation);

    ArithmeticOperationResult calculateOperation(ArithmeticOperationInput inputData);

}
