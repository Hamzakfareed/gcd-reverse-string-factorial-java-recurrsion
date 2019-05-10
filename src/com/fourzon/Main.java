package com.fourzon;

public class Main {
public static void main(String[] args) {
	Algorithm algorithm = new Algorithm();
	System.out.println(algorithm.sumOfInteger(1,3));
	System.out.println("Reverse Hello :"+algorithm.reverseString("Hello"));
	System.out.println("Factorial of 5 :"+algorithm.calculateFactorial(5));
	System.out.println("GCE:"+algorithm.gcd(2, 10));
}
}
