package day7;

import java.util.Scanner;

public class tryfinally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Enter slary: ");
			var salary = sc.nextInt();
			if(salary == 0)
				return;
			System.out.println("Your salary is " + salary);
		}
		
		catch (NullPointerException e) {
			System.out.println("Object does not allocate in memory");
		}
		catch(Exception obj) {
			System.out.println(obj.getMessage());
		}
		
		finally {
			System.out.println("Finally block executed");
			sc.close();
		}
		
		System.out.println("Outside try finally block");
		///////////////////////////////////////////////////
		System.out.println("___try with resource statement");
		
		try(Scanner s = new Scanner(System.in)) {
			System.out.println("Enter name: ");
			s.nextLine();
			System.out.println("Your name: " + s.nextLine());
			
		} catch (Exception obj) {
			System.out.println(obj.getMessage());
		}
		
	}
}
