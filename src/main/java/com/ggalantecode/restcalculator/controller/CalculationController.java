package com.ggalantecode.restcalculator.controller;

import com.ggalantecode.restcalculator.dto.ArithmeticOperationInput;
import com.ggalantecode.restcalculator.dto.ArithmeticOperationResult;
import com.ggalantecode.restcalculator.service.CalculationService;
import com.ggalantecode.restcalculator.strategy.Addition;
import com.ggalantecode.restcalculator.strategy.Division;
import com.ggalantecode.restcalculator.strategy.Multiplication;
import com.ggalantecode.restcalculator.strategy.Subtraction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculation")
public class CalculationController {

    @Autowired
    private CalculationService operationService;

    @PostMapping("/addition")
    @ResponseBody
    public ArithmeticOperationResult requestAddition(@RequestBody ArithmeticOperationInput inputData) {
        operationService.setArithmeticOperation(new Addition());
        return operationService.calculateOperation(inputData);
    }

    @PostMapping("/subtraction")
    @ResponseBody
    public ArithmeticOperationResult requestSubtraction(@RequestBody ArithmeticOperationInput inputData) {
        operationService.setArithmeticOperation(new Subtraction());
        return operationService.calculateOperation(inputData);
    }

    @PostMapping("/multiplication")
    @ResponseBody
    public ArithmeticOperationResult requestMultiplication(@RequestBody ArithmeticOperationInput inputData) {
        operationService.setArithmeticOperation(new Multiplication());
        return operationService.calculateOperation(inputData);
    }

    @PostMapping("/division")
    @ResponseBody
    public ArithmeticOperationResult requestDivision(@RequestBody ArithmeticOperationInput inputData) {
        operationService.setArithmeticOperation(new Division());
        return operationService.calculateOperation(inputData);
    }

}
