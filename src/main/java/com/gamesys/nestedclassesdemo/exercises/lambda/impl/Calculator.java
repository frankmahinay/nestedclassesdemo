package com.gamesys.nestedclassesdemo.exercises.lambda.impl;

import com.gamesys.nestedclassesdemo.exercises.lambda.CalcOperation;

/**
 * Complete the commented statements with the intended operation using lambda:
 *  1. create one method in Calculator that will accept two int parameters and will perform a specified operation on them,
 *  2. complete the console print lines in the main method by calling the method and supplying the necessary parameters
 */
public class Calculator
{
        CalcOperation addition = (a,b) -> a+b;
        CalcOperation subtraction = (a,b) -> a-b;
        CalcOperation multiplication = (a,b) -> a*b;
        CalcOperation division = (a,b) -> a/b;

    public int CalcOperators (int a, int b, CalcOperation operator) {

        return operator.operation(a, b);

    }

    public static void main(String[] args)
    {
        int a = 6;
        int b = 2;
        Calculator calculator = new Calculator();

        System.out.println("\nAddition result: " + calculator.CalcOperators(a, b, calculator.addition));
        System.out.println("\nSubtraction result: " + calculator.CalcOperators(a, b, calculator.subtraction));
        System.out.println("\nMultiplication result: " + calculator.CalcOperators(a, b, calculator.multiplication));
        System.out.println("\nDivision result: " + calculator.CalcOperators(a, b, calculator.division));
    }
}
