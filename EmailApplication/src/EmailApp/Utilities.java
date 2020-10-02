package EmailApp;
 

import java.util.*;
public class Utilities {
String fname = "";
 String lname = "";
 String depname = "";
 String ranpass = "";
 Scanner sc = new Scanner(System.in);
	public void InputDetails() {
		
		/*
		 * System.out.println(
		 * "*************************************************************"); System.out.
		 * println("**********Welcome the Email Generating Application***********");
		 * System.out.println(
		 * "*************************************************************");
		 */
		System.out.print("Enter your first name : ");
		fname = sc.next();
		System.out.println();
		System.out.print("Enter your last name : ");
		lname = sc.next();
		System.out.println();		
		
		System.out.println("********************************************");
		System.out.println("Hi " + fname + ",");
		System.out.println("      Welcome onboard     ");
		System.out.println("********************************************");
		
		while(true) {
		System.out.print("Enter your department : ");
		depname = sc.next();
		System.out.println();
		if(depname.equalsIgnoreCase("sales") || depname.equalsIgnoreCase("development") || depname.equalsIgnoreCase("accounts")) {
			break;
		} else {
			System.out.println("Please enter a valid Depertment");
		}
		}
	}
   public String GenerateEmail() {
	   String email = fname + "." + lname + "@" + depname + ".anyCompany.com";	   
	   return email;
   }
   public String getDept() {
	   return depname;
   }
public String newPassword() {
	String newpass = "";
	System.out.println("Please provide new password");
	newpass = sc.next();
	ranpass  = "The password is updated now!!!";
	return newpass;
}
public String randomPassword() {
	
	for(int i = 0 ; i < 7; i++) {
		int rnd = (int) (Math.random() * 52); 
	    char base = (rnd < 26) ? 'A' : 'a';	    
		ranpass = ranpass + (char) (base + rnd % 26);
	}
	return ranpass;
}
   
}
