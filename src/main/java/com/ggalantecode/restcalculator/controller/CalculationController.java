package com.ggalantecode.restcalculator.controller;

import com.ggalantecode.restcalculator.dto.*;
import com.ggalantecode.restcalculator.service.CalculationService;
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
        return operationService.selectOperationAndCalculate(inputData);
    }

    @PostMapping("/subtraction")
    @ResponseBody
    public ArithmeticOperationResult requestSubtraction(@RequestBody ArithmeticOperationInput inputData) {
        return operationService.selectOperationAndCalculate(inputData);
    }

    @PostMapping("/multiplication")
    @ResponseBody
    public ArithmeticOperationResult requestMultiplication(@RequestBody ArithmeticOperationInput inputData) {
        return operationService.selectOperationAndCalculate(inputData);
    }

    @PostMapping("/division")
    @ResponseBody
    public ArithmeticOperationResult requestDivision(@RequestBody ArithmeticOperationInput inputData) {
        return operationService.selectOperationAndCalculate(inputData);
    }

}
