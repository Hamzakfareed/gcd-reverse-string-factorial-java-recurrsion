package com.fourzon;

public class Algorithm {

	public int sumOfInteger(int n) {
		if (n == 1) {
			return 1;
		}

		return n + sumOfInteger(n - 1);
	}

	public String reverseString(String line) {

		if (line.isEmpty()) {
			return line;
		}

		return reverseString(line.substring(1)) + line.charAt(0);
	}

	public int factorial(int accumulator, int number) {
		if (number == 0 || number == 1) {
			return accumulator;
		}

		return factorial(accumulator * number, number - 1);
	}

	public int calculateFactorial(int n) {
		return factorial(1, n);
	}

	public int sumOfInteger(int accumulator, int n) {
		if (n == 1) {
			return accumulator;
		}

		return sumOfInteger(accumulator + n, n - 1);
	}

	public int gcd(int n1, int n2) {
		if(n2 == 0) 
		{
			return n1;
		}
		return gcd(n2,n1%n2);
	}
	
	
}















