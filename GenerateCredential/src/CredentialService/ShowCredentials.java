package CredentialService;

import Employee.Employee;

public class ShowCredentials {
	
	public void showCredentials(Employee employeeObject, String email, String generatedPassword) {
		
		System.out.println("Dear " + employeeObject.getFirstName() + " Your credentials: ");
		System.out.println("Your Email is: " + email);
		System.out.println("Your Password is:" + generatedPassword);
		
	}
}
