package com.gamesys.nestedclassesdemo.samples.innerclass.anonymous.interfacesample.impl;

import com.gamesys.nestedclassesdemo.samples.innerclass.anonymous.interfacesample.HeightPrinter;

class HeightDisplay {
    public static void main(String[] args) {
        HeightPrinter mh = new HeightPrinter() {
            @Override
            public void printHeight() {
                System.out.println("My height is " + HeightPrinter.heightInInches + " inches.");
            }
        };

        // MyHeight mh = new MyHeight();

        mh.printHeight();
    }
}
