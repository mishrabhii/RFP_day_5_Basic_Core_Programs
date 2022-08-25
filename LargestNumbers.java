package com.LargestNumbers;
import java.util.Scanner;
public class LargestNumbers {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Please Enter 1st number : ");
		int num1 = sc.nextInt();
		System.out.println("Please enter a 2nd number: ");
		int num2 = sc.nextInt();
		System.out.println( "Please enter a 3rd number: ");
		int num3 = sc.nextInt() ;
		
		if (num1>num2 && num1>num3) {
			System.out.println("num1 is lagest");
	}   if (num2>num1 && num2>num3) {
			System.out.println("num2 is lagest");
	}	if (num3>num1 && num3>num2) {
			System.out.println("num3 is lagest");
	}
			else 
			System.out.println("All numbers are equal");
		}
		}
	



	
