package com.bridgelabz;

import java.util.Scanner;

public class JUnit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name :");
		String firstName = scan.nextLine();
		System.out.println("Enter your last name :");
		String lastName = scan.nextLine();
		System.out.println("Enter your Email ID :");
		String emailId = scan.nextLine();
		
		System.out.println("first name is : " +firstName);
		System.out.println("first name is valid ? " + firstName(firstName));
		
		System.out.println("last name is : " +lastName);
		System.out.println("last name is valid ? " + lastName(lastName));
		
		System.out.println("Email ID is : " +emailId);
		System.out.println("Email ID valid ? " + emailId(emailId));
		
		

	}
	
	public static boolean firstName(String firstName) {
		return firstName.matches("[A-Z]{1}[a-z]{3}");	
	}
	
	public static boolean lastName(String lastName) {
		return lastName.matches("[A-Z]{1}[a-z]{3}");
	}
	
	public static boolean emailId(String emailId) {
		return emailId.matches("[abc](.+){1}[A-Za-z]*+@{1}[bl](.+)[co](.+)[in]$");
	}

}
