package com.gamesys.nestedclassesdemo.samples.anonymous.interfacesample.impl;

import com.gamesys.nestedclassesdemo.samples.anonymous.interfacesample.HeightPrinter;

class MyHeight implements HeightPrinter {
    @Override
    public void printHeight()
    {
        System.out.println("My height is " + HeightPrinter.heightInInches + " inches.");
    }
}
