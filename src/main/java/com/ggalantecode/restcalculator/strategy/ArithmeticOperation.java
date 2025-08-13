package com.ggalantecode.restcalculator.strategy;

public enum ArithmeticOperation {

    ADDITION {

        @Override
        public double calculate(double firstNumber, double secondNumber){
            return firstNumber + secondNumber;
        }

    },

    SUBTRACTION {

        @Override
        public double calculate(double firstNumber, double secondNumber){
            return firstNumber - secondNumber;
        }

    },

    MULTIPLICATION {

        @Override
        public double calculate(double firstNumber, double secondNumber){
            return firstNumber * secondNumber;
        }

    },

    DIVISION {

        @Override
        public double calculate(double firstNumber, double secondNumber){
            return firstNumber / secondNumber;
        }

    };

    public abstract double calculate(double firstNumber, double secondNumber);

}
