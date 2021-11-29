package Main;

import java.util.Scanner;

import CredentialService.GenerateEmailAddress;
import CredentialService.GeneratePassword;
import CredentialService.ShowCredentials;
import Employee.Employee;


public class DriverClass {
	public static void main(String[] argh) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to GL, generate credentials: ");
		System.out.println("Please enter your first name: ");
		String firstName = scanner.nextLine();
		System.out.println("Please enter your Last name: ");
		String lastName = scanner.nextLine();
		
		Employee employeeObject = new Employee(firstName, lastName);
		
		System.out.println("please choose department:");
		System.out.println("1: for Tech");
		System.out.println("2: for Admin");
		System.out.println("3: for HR");
		System.out.println("4: for Legal");
		
		int option = scanner.nextInt();
		String departmentName = "";
		switch (option) {
		
		case 1:
			departmentName = "tech";
			break;
			
		case 2:
			departmentName = "Admin";
			break;
			
		case 3:
			departmentName = "HR";
			break;
			
		case 4:
			departmentName = "Legal";
			break;
			
			default : 
				System.out.println("Enter valid value");
		
		}
		
		GeneratePassword generatePassword = new GeneratePassword();
		String generatedPassword = generatePassword.genertePassword();	
		
		GenerateEmailAddress generateEmail = new GenerateEmailAddress();
		String generatedEmail = generateEmail.generateEmailAddress(firstName, lastName, departmentName);
		
		ShowCredentials showCredential = new ShowCredentials();		
		showCredential.showCredentials(employeeObject, generatedEmail, generatedPassword);
		

		}
}
