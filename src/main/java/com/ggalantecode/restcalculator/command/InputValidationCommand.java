package com.ggalantecode.restcalculator.command;

import com.ggalantecode.restcalculator.dto.*;

public interface InputValidationCommand {

    ArithmeticOperationResult validateAndSendInputForCalculation(ArithmeticOperationInput inputData);

}
