package com.basicCorePrograms;
import java.util.Scanner;

public class HarmonicNumber {


	public static void main(String[] args) {

		int i = 0;
		int n = 0;
		double harmonic = 0.0;
		//System.out.println("Welcome to the nth harmonic number generate program =  ");
		System.out.println("Enter the 'n'th number: ");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n<=0)
			System.out.println("\n Enter a positive number. \n please try again ");
		else {

			for(i=1; i<=n; i++) {
				harmonic += (1/(double)i);
				System.out.println(harmonic + " ");
			}
			System.out.println(n + "th Harmonic Value = " + String.format("%.2f", harmonic));
		}
	}
}
