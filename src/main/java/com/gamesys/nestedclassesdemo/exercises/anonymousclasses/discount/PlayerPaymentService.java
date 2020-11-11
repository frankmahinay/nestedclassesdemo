package com.gamesys.nestedclassesdemo.exercises.anonymousclasses.discount;

public class PlayerPaymentService
{
    private double playerPayment = 100;
    private final String SPECIAL_PLAYER = "SPECIAL";

    public void calculateFinalPayment(String playerType)
    {
        //subtract discounts, if any
        if (SPECIAL_PLAYER.equals(playerType))
        {
            /** USE AN ANONYMOUS CLASS IMPLEMENTATION HERE, and
             * use DiscountCalculator's BASE_PERCENT_DISCOUNT to arrive at the value to assign to playerPayment */
            DiscountCalculator specialDiscount = new DiscountCalculatorForSpecialImpl();
            playerPayment = specialDiscount.calculateDiscount(playerPayment);
        }

        System.out.println("Final Payment for " + playerType + " player: " + playerPayment);
    }


    public static void main (String args[])
    {
        PlayerPaymentService pps = new PlayerPaymentService();
        pps.calculateFinalPayment("REGULAR");
        pps.calculateFinalPayment("SPECIAL");
    }
}

