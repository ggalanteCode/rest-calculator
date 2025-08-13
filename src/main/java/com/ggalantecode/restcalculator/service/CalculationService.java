package com.ggalantecode.restcalculator.service;

import com.ggalantecode.restcalculator.dto.*;

public interface CalculationService {

    ArithmeticOperationResult selectOperationAndCalculate(ArithmeticOperationInput inputData);

}
