package com.bridgelab.regexprograms;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class JavaRegex {
	

	public static void main(String[] args) {
		String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		String regex1 = "^[1-9][0-9][1-9][0-9]{9}$";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email Address: ");
		String data = sc.nextLine();
		System.out.println("Enter Mobile Number: ");
		String mobileNO = sc.nextLine();

		Pattern pattern = Pattern.compile(regex1);
		Matcher matcher = pattern.matcher(data);
		Matcher matcher1 = pattern.matcher(mobileNO);
		boolean result = matcher1.matches();

		if (result) {
			System.out.println("Valid Email");
			System.out.println("Valid Mobile Number");
		} else {
			System.out.println("Invalid Email");
			System.out.println("Invalid Mobile Number");
		}

	}
}
	
	

