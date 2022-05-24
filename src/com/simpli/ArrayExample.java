package com.simpli;

import java.util.Scanner;

public class ArrayExample {
	
	//Read 5 number from user and print their sum and avg
	public void add(int[] array) {
		int sum=0;
		for(int d:array) {
			sum=sum+d;
		}
		System.out.println("Sum of numbers: "+sum);
	}
	
	public void avg(int[] array) {
	  
		int sum=0;
		for(int d:array) {
			sum=sum+d;
		}
		System.out.println("avg of numbers: "+sum/array.length);
	}


public static void main(String[] args)
{
	//Read numbers from user

	System.out.println("Enter the count of array:");
	Scanner sc = new Scanner(System.in);
	int count=sc.nextInt();
	int[] array= new int[count];
	for(int i=0;i<count;i++) {
		System.out.println("Enter "+(i+1)+" element: ");
		array[i]=sc.nextInt();
	}
	//Printing the array 
	for(int k:array) {
		System.out.println("Elements of array: "+k);
	}
	ArrayExample a = new ArrayExample();
	a.add(array);
	a.avg(array);
}}