package CredentialService;

public class GenerateEmailAddress {
	
	public String generateEmailAdd(String firstName, String lastName, String departmentName) {
			 
			String generatedEmailAddress = firstName + lastName + "@" + departmentName + ".greatlearning.com";
			return generatedEmailAddress;
		}
}
