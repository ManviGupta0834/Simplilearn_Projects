package com.simpli;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class fileHandling {

	public static void main(String[] args) throws IOException {

		
		/*
		 * File f = new File("D:\\j2ee software\\calculator.docx"); FileReader fr= new
		 * FileReader(f); int i=fr.read();//read char by char and convert it into int
		 * while(i!=-1) { System.out.println((char)i); i=fr.read(); } //Reading line by
		 * line
		 * 
		 * BufferedReader br = new BufferedReader(fr); String line = br.readLine();
		 * while(line!=null) { System.out.println(line); line=br.readLine(); }
		 */
		  //Reading all lines at once
		  List<String> result = Files.readAllLines(Path.of("D:\\j2ee software\\Key.txt"));
		for (var a : result) {
			System.out.println(a);
		}
		
		//Write into file
		String name;
		System.out.println("Enter name:");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		FileWriter fw=new FileWriter("D:\\\\j2ee software\\\\Kyayr.txt");
		fw.append(name);

		/*br.close();
		fr.close();*/
		fw.close();
		sc.close();
	}
	

}
