package Main;

import java.util.Scanner;

import Employee.Employee;


public class DriverClass {
	public static void main(String[] argh) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to GL, generate credentials for you: ");
		System.out.println("Please enter your first name: ");
		String firstName = scanner.nextLine();
		System.out.println("Please enter your Last name: ");
		String lastName = scanner.nextLine();
		
		Employee employeeObject = new Employee(firstName, lastName);
		
		System.out.println("please choos department:");
		System.out.println("1: Tech");
		System.out.println("2: Admin");
		System.out.println("3: HR");
		System.out.println("4: Legal");
		
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
		
		}
}
