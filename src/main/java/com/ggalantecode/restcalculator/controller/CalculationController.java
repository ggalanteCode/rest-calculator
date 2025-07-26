package com.ggalantecode.restcalculator.controller;

import com.ggalantecode.restcalculator.dto.ArithmeticOperationInputData;
import com.ggalantecode.restcalculator.dto.ArithmeticOperationResultData;
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
    public ArithmeticOperationResultData requestAddition(@RequestBody ArithmeticOperationInputData inputData) {
        operationService.setArithmeticOperation(new Addition());
        return operationService.calculateOperation(inputData);
    }

    @PostMapping("/subtraction")
    @ResponseBody
    public ArithmeticOperationResultData requestSubtraction(@RequestBody ArithmeticOperationInputData inputData) {
        operationService.setArithmeticOperation(new Subtraction());
        return operationService.calculateOperation(inputData);
    }

    @PostMapping("/multiplication")
    @ResponseBody
    public ArithmeticOperationResultData requestMultiplication(@RequestBody ArithmeticOperationInputData inputData) {
        operationService.setArithmeticOperation(new Multiplication());
        return operationService.calculateOperation(inputData);
    }

    @PostMapping("/division")
    @ResponseBody
    public ArithmeticOperationResultData requestDivision(@RequestBody ArithmeticOperationInputData inputData) {
        operationService.setArithmeticOperation(new Division());
        return operationService.calculateOperation(inputData);
    }

}
