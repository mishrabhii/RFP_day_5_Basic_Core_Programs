package com.QuotientAndRemainder;
import java.util.Scanner;
public class QuotientAndRemainder {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number [DIVIDEND] :- ");
		float DIVIDEND = input.nextInt();
		System.out.println("Enter a number [DIVISOR] : -");
		float DIVISOR = input.nextInt();
	
		float quotient = DIVIDEND / DIVISOR;
		float remainder = DIVIDEND % DIVISOR;
	
		System.out.println("\nThe quotient is :- " + quotient);
		System.out.println("\nThe reminder is :- " + remainder);
	}

}
