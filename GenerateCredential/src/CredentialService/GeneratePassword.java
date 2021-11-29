package CredentialService;

import java.util.Random;
public class GeneratePassword {
	
	public String genertePassword() {
		String generatedPassword = "";
		
		String capitalLatter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLatters = "abcdefghijklmnopqrstuvwxyz";
		String specialChar = "!@#$%^&*()";
		String num = "1234567890";
		
		String values = capitalLatter + smallLatters + specialChar + num;
		//ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()1234567890
		
		
		Random rendomize = new Random();
		char[] password = new char[8];
		

		int lengthofValue = values.length(); //72
		//System.out.println("lengthofvalu: " + lengthofValue);
		
		for(int i=0;i<8;i++) {
			int randomNextInteger = rendomize.nextInt(lengthofValue);
			//System.out.println("rendomnextint: " + randomNextInteger);
			//System.out.println("rendomnextint: " + values.charAt(randomNextInteger));
			password[i]=values.charAt(randomNextInteger);
		}
		return generatedPassword;
	}

}
