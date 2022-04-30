package com.simpli;

import java.util.Scanner;

public class Calculator {
	void Add(int a, int b) {
		System.out.println("Addition result:" + (a + b));
	}

	void sub(int a, int b) {
		if (a > b) {
			System.out.println("Subtraction result:" + (a - b));
		} else
			System.out.println("Subtraction result:" + (b - a));
	}

	void Modulus(int a, int b) {
		System.out.println("Modulus:" + a % b);

	}

	void Multi(int a, int b) {
		System.out.println("Multiplication result:" + a * b);
	}

	void Division(int a, int b) {
		System.out.println("Division result:" + a / b);
	}

	public static void main(String[] args) {
		for (;;) {

			Calculator calc = new Calculator();
			System.out.println("Enter num1:");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			System.out.println("Enter num2:");
			int b = sc.nextInt();
			System.out.println(
					"Select an operation:\n1.Addition\n2.Subtraction\n3.Modulus\n4.Multiplication\n5.Division\n\nIf you want to EXIT, press 6.");
			int Operation = sc.nextInt();
			if (Operation == 1) {
				calc.Add(a, b);
			} else if (Operation == 2) {
				calc.sub(a, b);
			} else if (Operation == 3) {
				calc.Modulus(a, b);
			} else if (Operation == 4) {
				calc.Multi(a, b);
			} else if (Operation == 5) {
				calc.Division(a, b);
			} else if (Operation == 6) {
				System.exit(0);
			} else {
				System.out.println("Kindly Give appropriate Input");
			}

			System.out.println("Do you wanna continue?? If yes, press 1");
			Scanner s = new Scanner(System.in);
			int input = s.nextInt();
			if (input == 1)
			{
				continue;}
			else 
				break;
			}
		}
	}
