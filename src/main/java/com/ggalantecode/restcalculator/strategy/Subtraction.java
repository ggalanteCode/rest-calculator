package com.ggalantecode.restcalculator.strategy;

public class Subtraction implements ArithmeticOperation{
    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
}
