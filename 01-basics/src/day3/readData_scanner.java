package day3;

import java.util.Scanner;

public class readData_scanner {
	
	public static void main (String[] args) {
		//open
		Scanner sc= new Scanner(System.in);
		//process
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter salary: ");
		//double salary = sc.nextDouble();
		double salary =Double.parseDouble(sc.nextLine());
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		
		//close
		
		
		System.out.println("\n-------------data--------\n");
		System.out.println("Name: "+ name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
	}

}
