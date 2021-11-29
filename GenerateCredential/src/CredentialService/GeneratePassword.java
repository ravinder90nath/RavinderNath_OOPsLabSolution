package CredentialService;

import java.util.Random;
public class GeneratePassword {
	
	public String genertePassword() {
		String generatedPassword = "";
		
		String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialChar = "!@#$%^&*()";
		String number = "1234567890";
		
		String values = capitalLetter + smallLetters + specialChar + number;
		
		
		Random rendomize = new Random();
		char[] password = new char[8];
		

		int lengthofValue = values.length(); 		
		for(int i=0;i<8;i++) {
			int randomNextInteger = rendomize.nextInt(lengthofValue);
			password[i]=values.charAt(randomNextInteger);
		}
		generatedPassword = password.toString();
		return generatedPassword;
	}

}
