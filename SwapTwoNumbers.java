package com.SwapTwoNumbers;
import java.util.Scanner;
public class SwapTwoNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.print ("Enter the value of \n a = ");
		int a = sc.nextInt();
		System.out.print ("Enter the value of \n b = ");
		int b = sc.nextInt() ;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println( "After swaping the value of \n a = " + a + " \n b = " + b);
	}

}
