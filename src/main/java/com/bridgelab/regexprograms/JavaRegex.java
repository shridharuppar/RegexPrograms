package com.bridgelab.regexprograms;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class JavaRegex {
	

	public static void main(String[] args) {
		String regex = "^[1-9][0-9][1-9][0-9]{9}$";
		String regex1 = "^.{8,}$";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile Number: ");
		String mobileNO = sc.nextLine();
		System.out.println("Enter A Password: ");
		String password = sc.nextLine();

		Pattern pattern = Pattern.compile(regex1);
		Matcher matcher = pattern.matcher(mobileNO);
		Matcher matcher1 = pattern.matcher(password);
		boolean result = matcher1.matches();

		if (result) {
			System.out.println("Valid Mobile Number");
			System.out.println("You have entered a Valid Password");
		} else {
			System.out.println("Invalid Mobile Number");
			System.out.println("Invalid Password");
		}

	}
}
	
	

