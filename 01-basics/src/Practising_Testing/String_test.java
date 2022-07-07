package Practising_Testing;

import java.util.Scanner;

public class String_test {
	public static void main(String[] args) {
		String greeting = "HEllo How are you?";
		System.out.println(greeting.toUpperCase());
		System.out.println(greeting);
		System.out.println("Hey do you love me?");
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine();
		
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println(greeting.replace("HEllo How are you", "Really Love me"));
		}else if(answer.equalsIgnoreCase("no")){
			System.out.println(greeting.replace("HEllo How are you", "Are you sure"));
		}
	}
}
