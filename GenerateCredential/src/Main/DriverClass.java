package Main;

import java.util.Scanner;


public class DriverClass {
	public static void main(String[] argh) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to GL, lets generate your credentials for you!: ");
		System.out.println("Please enter your first name: ");
		String firstName = scanner.nextLine();
		System.out.println("Please enter your Last name: ");
		String lastName = scanner.nextLine();
		
		System.out.println("please enter the department from the following");
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
