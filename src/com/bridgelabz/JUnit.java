package com.bridgelabz;

import java.util.Scanner;

public class JUnit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name :");
		String firstName = scan.nextLine();
		
		System.out.println("first name is : " +firstName);
		System.out.println("first name is valid ? " + firstName(firstName));

	}
	
	public static boolean firstName(String firstName) {
		return firstName.matches("[A-Z]{1}[a-z]{3}");	
	}

}
