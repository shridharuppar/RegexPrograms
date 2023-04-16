package com.bridgelab.regexprograms;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class JavaRegex {
	

	public static void main(String[] args) {
		String regex = "^[A-Z][a-zA-Z]{2,}$";
		String regex1 = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Name : ");
		String firstName = sc.nextLine();
		System.out.println("Enter The Last Name : ");
		String lastName = sc.nextLine();
		System.out.println("Enter Email Address: ");
		String data = sc.nextLine();

		Pattern pattern = Pattern.compile(regex1);

		Matcher matcher = pattern.matcher(firstName + lastName);
		Matcher matcher1 = pattern.matcher(data);
		boolean result = matcher1.matches();

		if (result) {
			System.out.println("Valid first name and last name");
			System.out.println("Valid Email");
		} else {
			System.out.println("Pattern not matched");
			System.out.println("Invalid Email");
		}

	}

}
	
	

