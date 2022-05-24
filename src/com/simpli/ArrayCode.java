package com.simpli;
import java.util.Scanner;

public class ArrayCode {
	public static void main(String[] args) {
	//SIngle Dimentional Array using Static Approach
     int a[]={23,56,43,98};
     for(int i=0;i<a.length;i++) {
    	 System.out.println("Element is :"+a[i]);
     }

//Single Dimentional Array using Dynamic approach
     System.out.println("Enter the size of array");
     Scanner sc=new Scanner(System.in);
     int size= sc.nextInt();
     int a1[]= new int[size];
     //entering the values into array dynamically
     for(int i=0;i<a1.length;i++) {
    	 System.out.println("Enter the value of element "+(i+1)+": ");
    	 a1[i]=sc.nextInt();
     }
     //Displaying Values of array
    	 for(int i=0;i<a1.length;i++) {
    		 System.out.println("Enter the value of element "+(i+1)+": "+a[i]); 
    	 }
     
    	 
    		         System.out.println("-----------Static Approach-------------");
    		         //multidimensional array
    		         int[][] b = {
    		                 {2, 4, 6, 8}, 
    		                 {3, 6, 9}, 
    		         };
    		         System.out.println("\nLength of row 1: " + b[0].length);
    		         System.out.println("\nLength of row 2: " + b[1].length);
    		         
    		         int [][] a2 = new int[2][2];
    		         for(int i=0;i<2;i++) {
    		             for(int j=0;j<2;j++) {
    		                 System.out.println("Enter the element no:"+(j+1));
    		                 a2[i][j]=sc.nextInt();
    		             }
    		         }
    		         
    		         for(int i=0;i<2;i++) {
    		             for(int j=0;j<2;j++) {
    		                 System.out.println("the element no:"+(j+1)+" is: "+a2[i][j]);
    		             }
    		         }    }
    		 
}
	