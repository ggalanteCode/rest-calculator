package com.ggalantecode.restcalculator.service;

import com.ggalantecode.restcalculator.dto.ArithmeticOperationInputData;
import com.ggalantecode.restcalculator.dto.ArithmeticOperationResultData;
import com.ggalantecode.restcalculator.strategy.ArithmeticOperation;

public interface CalculationService {

    void setArithmeticOperation(ArithmeticOperation operation);

    ArithmeticOperationResultData calculateOperation(ArithmeticOperationInputData inputData);

}
