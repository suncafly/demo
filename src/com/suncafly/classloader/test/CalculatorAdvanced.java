package com.suncafly.classloader.test;


import com.suncafly.classloader.ICalculator;

public class CalculatorAdvanced implements ICalculator {

	public String calculate(String expression) {
		return "Result is " + expression;
	}

	public String getVersion() {
		System.out.println("-----------");
		return "2.0";
	}

}
