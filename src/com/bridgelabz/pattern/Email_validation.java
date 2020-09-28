package com.bridgelabz.pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_validation {
	
	public boolean checkPattern(String name) {
		   boolean result = false;
		   String pattern = "^(.[A-Za-z]{2})?$";
		   
		   // Create a Pattern object
		   Pattern r = Pattern.compile(pattern);

		   // Now create matcher object.
		   Matcher m = r.matcher(name);
		   if (m.find())
			   	result = true;
		   else 
			   result = false;
		   
		   return result;
	   }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       Email_validation obj = new Email_validation();
	       System.out.println("Enter second optional part of an email");
	       String value = sc.nextLine();
	       Boolean ans = obj.checkPattern(value);
	       System.out.println(ans);
	}
}
