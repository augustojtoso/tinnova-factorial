package com.tinnova.factorial;

import java.util.Arrays;

public class FactorialApplication {

	public static void main(String[] args) {
		FactorialService factorialService = new FactorialService();
		Arrays.stream(args).map(factorialService::getResult).forEach(System.out::println);
	}

}
