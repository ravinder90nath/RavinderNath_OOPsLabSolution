package CredentialService;


public class ShowCredentials {
	public void showCredential(Employee employeeObject, String email, String generatedPassword) {
	
		System.out.println("Dear " + employeeObject .getFirstName() + "You credentials are: ");
		System.out.println("Email is: " + generatedEmailAddress);
		System.out.println("Password is:" + generatedPassword);
		
	}
}
