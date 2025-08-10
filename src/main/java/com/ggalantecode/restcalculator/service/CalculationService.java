package com.ggalantecode.restcalculator.service;

import com.ggalantecode.restcalculator.dto.*;
import com.ggalantecode.restcalculator.strategy.ArithmeticOperation;

public interface CalculationService {

    void setArithmeticOperation(ArithmeticOperation operation);

    ArithmeticOperationResult calculateOperation(ArithmeticOperationInput inputData);

}
