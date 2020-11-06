package com.gamesys.nestedclassesdemo;

import com.gamesys.nestedclassesdemo.samples.lambda.GreeterSample;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class NestedClassesDemoMain {

	public static void main(String[] args)
	{
		// Lambda expression that implements
		// LambdaExampleInterface, and
		// implements sampleAbstractMethod() by default
		GreeterSample mySample = (String x) -> System.out.println("Hello there, " + x + "!");

		// Calls the lambda expression
		mySample.sampleAbstractMethod("Frank");


		//Separate sample for calling lambda functions -- will be discussed in more detail on later lessons
		List<Double> arraySample = new ArrayList<Double>();

		// Using lambda expression to print even elements of an array
		arraySample.forEach(n -> {
			if (n % 2 == 0) System.out.println(n);
		});

	}

}
