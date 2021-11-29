package CredentialService;

import java.util.Random;

public class GeneratePassword {
	
	
	
	
	public String genertePassword() {
		String generatedPassword = "";
		
		String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specialChar = "!@#$%^&*()";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String number = "1234567890";
		
		String values = capitalLetter + smallLetters + specialChar + number;
		
		
		Random rendomize = new Random();
		char[] password = new char[10];
		

		int lengthofValue = values.length(); 		
//		System.out.println(lengthofValue);
//		System.out.println();
		for(int i=0;i<10;i++) {
			int randomNextInteger = rendomize.nextInt(lengthofValue);
			password[i]=values.charAt(randomNextInteger);
			
//			
//			System.out.print(randomNextInteger +" ");
//			System.out.println(values.charAt(randomNextInteger));
		}
		generatedPassword = password.toString();
		return generatedPassword;
	}
	
}
