package CredentialService;

import Department.Department;

public class GenerateEmailAddress {
	
	public String generateEmailAddress(String firstName, String lastName, String departmentName) {
			String generatedEmailAddress = "";
			generatedEmailAddress = firstName + lastName + "@" + departmentName + ".greatlearning.com";
			return generatedEmailAddress;
		}
}
