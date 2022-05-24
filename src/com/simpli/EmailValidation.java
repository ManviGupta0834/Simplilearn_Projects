package com.simpli;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args)
	{
		boolean isFound=false;
		ArrayList<String> list= new ArrayList<String>();
		list.add("manvigupta0834@gmail.com");
		list.add("karanveer23@gmail.com");
		list.add("raj123@gmail.com");
		list.add("snoopy12hunter@gmail.com");
		list.add("19ajay72@gmail.com");
		
		System.out.println("Enter mail id to search");
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine();
		for(String d:list)
		{
			if(d.equalsIgnoreCase(input))
			{
				System.out.println("Email validated.");
				isFound=true;
				break;
			}   
			
		}
		if(isFound==false)
			System.out.println("Email is not validated");
	}
}
