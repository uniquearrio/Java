package Practising_Testing;

import java.util.Scanner;

public class UserInput_Practise {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Number input
		System.out.println("Enter any number: ");
		int user_input_num = scan.nextInt();
		System.out.println("User enter number is :" + user_input_num);
		scan.nextLine();
		//String input
		System.out.println("Enter any string: ");
		String user_input_string = scan.nextLine();
		System.out.println("User enter string is : " + user_input_string);
		
		//double input
		System.out.println("Enter any double value: ");
		Double user_input_double = scan.nextDouble();
		System.out.println("User enter double is :" + user_input_double);
	}
}
