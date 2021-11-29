package CredentialService;

import Employee.Employee;

public class ShowCredentials {
	
	public void showCredentials(Employee employeeObj, String email, String Password) {
		
		System.out.println("Dear " + employeeObj.getFirstName() + " Your credentials: ");
		System.out.println("Your Email is: " + email);
		System.out.println("Your Password is:" + Password);
		
	}
}
