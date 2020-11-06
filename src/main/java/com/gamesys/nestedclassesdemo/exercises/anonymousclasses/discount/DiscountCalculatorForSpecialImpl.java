package com.gamesys.nestedclassesdemo.exercises.anonymousclasses.discount;

public class DiscountCalculatorForSpecialImpl implements DiscountCalculator{
    @Override
    public double calculateDiscount(double initialCost)
    {
        return initialCost * 0.93;
    }
}
