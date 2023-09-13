package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What's your name?");
		String name = sc.nextLine();
		String name1 = name.toLowerCase().trim();
		
		System.out.print("What's your surname?");
		String surname = sc.nextLine();
		String surname1 = surname.toLowerCase().trim();
		
		System.out.print("What's your favorite color?");
		String color = sc.nextLine();
		String color1 = color.toLowerCase();
		
		System.out.print("What's your day of birth?");
		String day = sc.nextLine();
		
		System.out.print("What's your month of birth?");
		String month = sc.nextLine();
		
		System.out.print("What's your year of birth?");
		String year = sc.nextLine();
		
		sc.close();
		
		String password = name1 + "-" + surname1 + "-" + color1 + "-" + day + "-" + month + "-" + year;
		System.out.println("Your password will be " + password + " if you like it!");
		
	}

}
