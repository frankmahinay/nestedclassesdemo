package com.gamesys.nestedclassesdemo.samples.innerclass.anonymous.interfacesample.impl;

import com.gamesys.nestedclassesdemo.samples.innerclass.anonymous.interfacesample.HeightPrinter;

class MyHeight implements HeightPrinter {
    @Override
    public void printHeight()
    {
        System.out.println("My height is " + HeightPrinter.heightInInches + " inches.");
    }
}
