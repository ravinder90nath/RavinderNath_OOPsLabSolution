package CredentialService;

import java.util.Random;

public class GeneratePassword {
	
	
	public String genertePassword() {
		String generatedPassword = "";
		
		String capitalletter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specialsymbols = "!@#$%^&*()";
		String smallletter = "abcdefghijklmnopqrstuvwxyz";
		String number = "1234567890";
		
		String values = capitalletter + smallletter + specialsymbols + number;
		
		
		Random rendomize = new Random();
		char[] password = new char[10];
		

		int lengthCount = values.length(); 		
//		System.out.println(lengthCount);
//		System.out.println();
		for(int i=0;i<10;i++) {
			int rendomText = rendomize.nextInt(lengthCount);
			password[i]=values.charAt(rendomText);
			
			
//			System.out.print(rendomText +" ");
//			System.out.println(values.charAt(rendomText));
		}
		generatedPassword = password.toString();
		return generatedPassword;
	}
	
}
