package com.ggalantecode.restcalculator.controller;

import com.ggalantecode.restcalculator.command.InputValidationCommand;
import com.ggalantecode.restcalculator.dto.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculation")
public class CalculationController {

    private InputValidationCommand inputValidationCommand;

    public CalculationController(InputValidationCommand command) {
        inputValidationCommand = command;
    }

    @PostMapping
    @ResponseBody
    public ArithmeticOperationResult requestCalculation(@RequestBody ArithmeticOperationInput input) {
        return inputValidationCommand.validateAndSendInputForCalculation(input);
    }

}
