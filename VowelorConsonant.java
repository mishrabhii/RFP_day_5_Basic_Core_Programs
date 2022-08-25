package com.Vowel_or_Consonant;
import java.util.Scanner;
public class VowelorConsonant {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a letter of the Alphabet : ");
	char a = sc.next().charAt(0);
	if (a=='a' || a=='A' || a=='e' || a=='E' || a=='i' ||a=='I' || a=='o' || a=='O' || a=='u' ||a=='U') 
		System.out.println(" "+ a +" is a Volel");
		else
	
	System.out.println(" "+ a + " is a Consonant ");
}
}
