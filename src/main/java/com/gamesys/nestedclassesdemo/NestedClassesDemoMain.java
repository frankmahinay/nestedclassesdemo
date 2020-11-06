package com.gamesys.nestedclassesdemo;

import com.gamesys.nestedclassesdemo.samples.lambda.GreeterSample;

public class NestedClassesDemoMain {

	public static void main(String[] args)
	{
		// Lambda expression that implements
		// LambdaExampleInterface, and
		// implements sampleAbstractMethod() by default
		GreeterSample mySample = (String x) -> System.out.println("Hello there, " + x + "!");

		// Calls the lambda expression
		mySample.sampleAbstractMethod("Frank");

	}

}
