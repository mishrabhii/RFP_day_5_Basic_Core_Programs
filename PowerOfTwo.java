package com.PowerOfTwo;
import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {
        

		int i=1;
		int result =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number for power of 2 :  ");
		int powerTimes = scanner.nextInt();
				
		if(powerTimes > 0 && powerTimes <= 100) {
		for(i = 1; i <= powerTimes; i++) {
		result=2*i;
		System.out.println("2*"+i+"= "+result);
		}
		}
		else
		System.out.println("power must be in 0 < power <= 100");
				
		}
	
	}