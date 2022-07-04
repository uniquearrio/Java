package day3;

import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String[] args) {
		//if statement
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter language: ");
		String lang = sc.nextLine();
		
		if(lang.equalsIgnoreCase("Java")) {
			System.out.println("Best programming language");
		}
		//if ese if statement
		
		System.out.println("---if else-------");
		System.out.print("Enter email: ");
		String mail = sc.nextLine();
		System.out.print("Enter password: ");
		String pass = sc.nextLine();
		if(mail.equals("admin@email.com")) {
			System.out.println("Login success..");
		}
		else {
			System.out.println("Login Err!!");
		}
		
		//if elseif statement
		
		System.out.println("-----if elseif  ");
		System.out.print("Enter yout bmi balue: ");
		float bmi = sc.nextFloat();
		if(bmi < 18.5) {
			System.out.println("Under Weight");	
		}
		else if(bmi>18.5 && bmi<25) {
			System.out.println("Normal");
		}
			
	}
}
