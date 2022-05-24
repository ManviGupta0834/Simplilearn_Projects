package com.simpli;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileHandlingExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   // take input name and print the score after searching in the file
		boolean ifFound=false;
		System.out.println("Enter name: ");
		Scanner sc= new Scanner(System.in);
		String name=sc.nextLine();
		FileReader fr= new FileReader("D:\\j2ee software\\scores.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(ifFound!=true) {
		var result=br.readLine();
		var list=result.split(",");
		if(name.equalsIgnoreCase(list[0])) 
		{
			System.out.println(list[1]);
			ifFound=true;
		}
	}
	}
}
