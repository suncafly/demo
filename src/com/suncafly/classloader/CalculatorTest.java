package com.suncafly.classloader;


public class CalculatorTest {

	public static void main(String[] args) {
		String url = "http://localhost:8080/demo/classes";
		NetworkClassLoader ncl = new NetworkClassLoader(url);
		String basicClassName = "com.suncafly.classloader.test.CalculatorBasic";
		String advancedClassName = "com.suncafly.classloader.test.CalculatorAdvanced";
		try {
			Class<?> clazz = ncl.loadClass(basicClassName);
			ICalculator calculator = (ICalculator) clazz.newInstance();
			System.out.println(calculator.getVersion());
			clazz = ncl.loadClass(advancedClassName);
			calculator = (ICalculator) clazz.newInstance();
			System.out.println(calculator.getVersion());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
