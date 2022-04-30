package com.simpli;

import java.util.Scanner;

//WAP to convert String input into Int.
public class typeCasting {

	public static void main(String[] args) {
		System.out.println("Implicit Type Casting");
		char a = 'A';
		System.out.println("Value of a: " + a);
		int b = a;
		System.out.println("Value of b: " + b);
		long l = b;
		System.out.println("Value of l: " + l);
		float c = l;
		System.out.println("Value of c: " + c);
		double d = c;
		System.out.println("Value of d: " + d);

		System.out.println("Explicit Type Casting");
		double d1 = 87.0;
		float f1 = (float) d1;
		System.out.println("value of f1:" + f1);

	}
}
