package com.ggalantecode.restcalculator.command;

import com.ggalantecode.restcalculator.dto.*;
import com.ggalantecode.restcalculator.service.CalculationService;

public interface InputValidationCommand {

    void setCalculationService(CalculationService service);

    ArithmeticOperationResult validateAndSendInputForCalculation(ArithmeticOperationInput inputData);

}
