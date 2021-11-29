package CredentialService;

public class GenerateEmailAddress {
	

	
	public String generateEmailAddress(String firstName, String lastName, String departmentName) {
		 
		String generatedEmailAddress = firstName + lastName + "@" + departmentName + ".greatlearning.com";
		return generatedEmailAddress;
		
	}
}
